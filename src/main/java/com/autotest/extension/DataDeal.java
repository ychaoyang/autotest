package com.autotest.extension;

import com.csvreader.CsvWriter;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by ychaoyang on 2017/7/14.
 */
public class DataDeal {

    private static final ExtensionContext.Namespace NAMESPACE = ExtensionContext.Namespace.create("AutoTestExtension",
            "DataDeal");

    protected static final Logger logger = LoggerFactory.getLogger(DataDeal.class);


    public static String[] getParams(ExtensionContext context, String file) {
        if (null == file || file.isEmpty()) {
            throw new IllegalArgumentException("csv文件路径file的值不能为空");
        }
        if (file.startsWith("/")) {
            file = file.substring(1);
        }
        Method m = context.getTestMethod().get();
        List<Param> args = getVariables(context);
        URL url = Thread.currentThread().getContextClassLoader()
                .getResource("autotest/" + file);
        if (null == url) {
            String filep = context.getTestClass().get().getClassLoader().getResource(".").getFile();
            String fileDir = filep.replace("target/test-classes/", "src/test/resources/autotest/") + file;
            createCsvFile(args, fileDir);
            throw new IllegalArgumentException("找不到csv文件,创建文件成功:" + fileDir);

        }
        String filePath = Thread.currentThread().getContextClassLoader()
                .getResource("autotest/" + file).getPath();

        File fl = new File(filePath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fl));
            List<String> result = new ArrayList<>();
            String[] pars;
            int lineNo = 0;
            String[] header = null;
            String line = null;
            while ((line = reader.readLine()) != null) {
                ++lineNo;
                if (lineNo == 1) {
                    header = splitContent(line);
                } else {
                    if (line.contains("~")) {
                        line = line.replace("~", "");
                    }
                    List<String> list = new ArrayList<>();
                    HashMap<String, String> map = parseLine(header, line, lineNo);
                    for (int n = 0; n < args.size(); n++) {
                        String name = args.get(n).getName();
                        if (StringUtils.isNotBlank(map.get(name))) {
                            String val = map.get(name).toString().trim();
                            if (val.contains("。")) {
                                val = val.replace("。", ",");
                            }
                            list.add(val);
                        } else {
                            String type = args.get(n).getType();
                            if ("String".equals(type)) {
                                list.add("");
                                continue;
                            } else if ("int".equals(type)
                                    || "Integer".equals(type)
                                    || "long".equals(type)
                                    || "Long".equals(type)
                                    || "short".equals(type)
                                    || "Short".equals(type)
                                    || "byte".equals(type)
                                    || "Byte".equals(type)
                                    || "float".equals(type)
                                    || "Float".equals(type)
                                    || "double".equals(type)
                                    || "Double".equals(type)
                                    || "char".equals(type)
                                    || "Character".equals(type)
                                    ) {
                                list.add("0");
                                continue;
                            } else if ("boolean".equals(type)) {
                                list.add("false");
                                continue;
                            } else {
                                list.add("");
                            }
                        }
                    }
                    StringBuffer str = new StringBuffer();
                    Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        str.append(iterator.next() + ",");
                    }
                    if (0 != str.length()) {
                        result.add(str.deleteCharAt(str.length() - 1).toString());
                    }
                }
            }
            int times = result.size();
            String methodName = context.getTestMethod().get().getName();
            context.getStore(NAMESPACE).put("methodName", methodName);
            context.getStore(NAMESPACE).put("times", times);
            return result.toArray(new String[result.size()]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Pattern pattern = Pattern.compile("\\{[^}]*\\}");

    public static String[] splitContent(String input) {

        //过滤所有的json字符串
        Matcher match = pattern.matcher(input);
        while (match.find()) {
            if (!StringUtils.isBlank(match.group())) {
                String json = match.group();
                String fmt_json = json.replace(",", "。");
                input = replace(input, json, fmt_json);
            }
        }
        ArrayList<String> result = new ArrayList();
        char character = 0;
        StringBuilder value = new StringBuilder();

        for (int i = 0; i < input.length(); ++i) {
            char previousCharacter = character;
            character = input.charAt(i);
            if (character != 44 && character != 124) {
                value.append(character);
            } else if (previousCharacter == 92) {
                value.setCharAt(value.length() - 1, character);
            } else {
                result.add(value.toString().trim());
                value = new StringBuilder();
            }
        }

        result.add(value.toString().trim());
        return (String[]) result.toArray(new String[0]);
    }

    public static String replace(String text, String repl, String with) {
        return replace(text, repl, with, -1);
    }

    public static String replace(String text, String repl, String with, int max) {
        if ((text == null) || (repl == null) || (with == null) || (repl.length() == 0)
                || (max == 0)) {
            return text;
        }

        StringBuffer buf = new StringBuffer(text.length());
        int start = 0;
        int end = 0;

        while ((end = text.indexOf(repl, start)) != -1) {
            buf.append(text.substring(start, end)).append(with);
            start = end + repl.length();

            if (--max == 0) {
                break;
            }
        }

        buf.append(text.substring(start));
        return buf.toString();
    }

    private static HashMap<String, String> parseLine(String[] header, String line, int lineNo) {
        HashMap<String, String> parMap = new HashMap<String, String>();
        String[] params = splitContent(line);
        if (params.length != header.length) {
            throw new RuntimeException("数据文件:" + " 第" + lineNo + "行格式错误");
        } else {
            for (int i = 0; i < header.length; ++i) {
                parMap.put(header[i], params[i]);
            }

        }
        return parMap;
    }


    /**
     * 获取方法的参数
     *
     * @param context
     * @return
     */
    public static List<Param> getVariables(ExtensionContext context) {
        List<Param> list = new ArrayList<Param>();
        Parameter[] Paramters = context.getTestMethod().get().getParameters();
        LocalVariableTableParameterNameDiscoverer u =
                new LocalVariableTableParameterNameDiscoverer();
        String[] params = u.getParameterNames(context.getTestMethod().get());
        for (int i = 0; i < Paramters.length; i++) {
            Param p = new Param();
            p.setName(params[i].trim());
            p.setType(Paramters[i].getType().getSimpleName());
            list.add(p);
        }

        return list;
    }

    public static void createCsvFile(List<Param> list, String filePath) {
        File excelfile = new File(filePath);
        if (!excelfile.exists()) {
            try {
                String dir = filePath.substring(0,filePath.lastIndexOf("/"));
                File dirFile = new File(dir);
                if(!dirFile.exists()){
                    dirFile.mkdir();
                }
                CsvWriter cwriter = new CsvWriter(filePath);
                for (Iterator<Param> it = list.iterator(); it.hasNext(); ) {
                    Param p = (Param) it.next();
                    cwriter.write(p.getName(), true);
                }
                cwriter.endRecord();
                for (Iterator<Param> it = list.iterator(); it.hasNext(); ) {
                    Param p = (Param) it.next();
                    if (null != p.getValue()) {
                        cwriter.write(p.getValue(), true);
                    }
                }
                cwriter.flush();// 刷新数据
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            logger.info("csv文件已存在!");
        }
    }

}
