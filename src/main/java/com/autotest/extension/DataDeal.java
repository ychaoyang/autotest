package com.autotest.extension;

import com.csvreader.CsvWriter;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.URL;
import java.util.*;


/**
 * Created by ychaoyang on 2017/7/14.
 */
public class DataDeal {

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
                .getResource(file);
        if (null == url) {
            String filep = context.getTestClass().get().getClassLoader().getResource(".").getFile();
            String fileDir = filep.replace("target/test-classes/", "src/test/resources/") + file;
            createCsvFile(args, fileDir);
            throw new IllegalArgumentException("找不到csv文件,创建文件成功:" + fileDir);

        }
        String filePath = Thread.currentThread().getContextClassLoader()
                .getResource(file).getPath();

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
                    if (line.startsWith("~")) {
                        line = line.replace("~", "");
                    }
                    List<String> list = new ArrayList<>();
                    List<HashMap<String, String>> parList = parseLine(header, line, lineNo);
                    int k = 0;
                    for (int n = 0; n < args.size(); n++) {
                        for (Map<String, String> map : parList) {
                            String name = args.get(n).getName();
                            if (null != map.get(name)) {
                                list.add(map.get(name).toString().trim());
                                k++;
                            }
                        }
                        if (k - n != 1) {
                            String type = args.get(n).getType();
                            if ("int".equals(type)
                                    || "Integer".equals(type)
                                    || "long".equals(type)
                                    || "short".equals(type)
                                    || "byte".equals(type)
                                    || "float".equals(type)
                                    || "double".equals(type)
                                    || "char".equals(type)
                                    ) {
                                list.add("0");
                            } else if ("boolean".equals(type)) {
                                list.add("false");
                            } else {
                                list.add(null);
                            }
                            k++;
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
            int time = result.size();
            String methodName = context.getTestMethod().get().getName();
            logger.info("========测试用例[{}]开始执行，一共执行[{}]次========", methodName, time);
            return result.toArray(new String[result.size()]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String[] splitContent(String input) {
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

    private static List<HashMap<String, String>> parseLine(String[] header, String line, int lineNo) {
        List list = new ArrayList();
        String[] params = splitContent(line);
        if (params.length != header.length) {
            throw new RuntimeException("数据文件:" + " 第" + lineNo + "行格式错误");
        } else {
            for (int i = 0; i < header.length; ++i) {
                Map<String, String> parMap = new HashMap<String, String>();
                parMap.put(header[i], params[i]);
                list.add(parMap);
            }

        }
        return list;
    }


    /**
     * 获取方法的参数
     *
     * @param context
     * @return
     */
    public static List<Param> getVariables(ExtensionContext context) {
        List<Param> list = new ArrayList<Param>();
        Parameter[] parameters = context.getTestMethod().get().getParameters();
        LocalVariableTableParameterNameDiscoverer u =
                new LocalVariableTableParameterNameDiscoverer();
        String[] params = u.getParameterNames(context.getTestMethod().get());
        for (int i = 0; i < parameters.length; i++) {
            Param p = new Param();
            p.setName(params[i].trim());
            p.setType(parameters[i].getType().getSimpleName());
            list.add(p);
        }

        return list;
    }

    public static void createCsvFile(List<Param> list, String filePath) {
        File excelfile = new File(filePath);
        if (!excelfile.exists()) {
            try {
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
