package com.autotest.generate;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by yu on 17/12/22.
 */
public class GenerateBase {

	/**
	 * 根据项目名称生成base类
	 *
	 * @param projectName
	 * @return
	 */
	public void generateBase(String projectName, List<GeneratedJavaFile> generatedJavaFiles, boolean covered) {
		try {
			List<Map<String, Object>> tableList = new ArrayList<>();
			List<String> fileNames = new ArrayList<>();
			for (GeneratedJavaFile gjf : generatedJavaFiles) {
				if (gjf.getCompilationUnit().getType().getShortNameWithoutTypeArguments().endsWith("DO")) {
					fileNames.add(gjf.getCompilationUnit().getType().getShortNameWithoutTypeArguments());
				}
			}
			Collections.sort(fileNames);
			for (String fileName : fileNames) {
				for (GeneratedJavaFile gjf : generatedJavaFiles) {
					if (fileName.equals(gjf.getCompilationUnit().getType().getShortNameWithoutTypeArguments())) {
						Map<String, Object> tableMap = new HashMap<String, Object>();
						tableMap.put("tableName", gjf.getCompilationUnit().getType().getShortNameWithoutTypeArguments()
								.replace("DO", ""));
						List<Param> pars = new ArrayList<>();
						TopLevelClass tlc = (TopLevelClass) gjf.getCompilationUnit();
						List<String> list = tlc.getAnnotations();
						String table= null;
						for (String s : list) {
							if (s.contains("@Table(name =")) {
								table = s.split("\"")[1];
							}
						}
						tableMap.put("table",table);
						for (Field f : tlc.getFields()) {
							if ("serialVersionUID".equals(f.getName())) {
								continue;
							}
							Param par = new Param();
							par.setName(f.getName());
							par.setTypeName(f.getType().getShortNameWithoutTypeArguments());
							if ("Long".equals(par.getTypeName())) {
								par.setTypeName("long");
							}
							List<String> strs = f.getAnnotations();
							String clumnName = "";
							for (String str : strs) {
								if (str.contains("@Column(name =")) {
									clumnName = str.split("\"")[1];
									if (clumnName.split("_").length > 1 && clumnName.split("_")[0].length() == 1) {
										par.setAnnotation(clumnName);
									}
								}
							}
							pars.add(par);
						}
						tableMap.put("pars", pars);
						tableList.add(tableMap);
					}
				}
			}
			// AutoTestBase类
			String className = toUpperCaseFirstOne(projectName) + "TestBase";
			String filePath = Thread.currentThread().getContextClassLoader().getResource("ftl/").getPath()
					.replace("/target/test-classes", "/src/test/resources");
			String outFile = getClassFilePath(GenerateBase.class).replace("\\target\\classes", "\\src\\test\\java")
					.replace("generate\\" + GenerateBase.class.getSimpleName() + ".class", "testbase\\"
							+ className + ".java");
			String packageName = "com.autotest.testbase";
			Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);
			cfg.setDirectoryForTemplateLoading(new File(filePath));
			cfg.setDefaultEncoding("UTF-8");
			cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

			Map<String, Object> root = new HashMap<String, Object>();
			root.put("packageName", packageName);
			root.put("projectName", projectName);
			root.put("className", className);
			root.put("time", new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
			root.put("author", "autotest");
			root.put("tableList", tableList);
			if (covered || !new File(outFile).exists()) {
				Template template = cfg.getTemplate("generateTestBase.ftl");
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
				template.process(root, out);
				System.out.println("更新成功" + outFile);
			}

			// DataSourceConfig类
			String className3 = toUpperCaseFirstOne(projectName) + "DataSourceConfig";
			String outFile3 = getClassFilePath(GenerateBase.class).replace("\\target\\classes", "\\src\\main\\java")
					.replace("generate\\" + GenerateBase.class.getSimpleName() + ".class", "config\\"
							+ className3 + ".java");
			if (covered || !new File(outFile3).exists()) {
				Template template3 = cfg.getTemplate("generateDataSourceConfig.ftl");
				PrintWriter out3 = new PrintWriter(new BufferedWriter(new FileWriter(outFile3)));
				root.put("className", className3);
				template3.process(root, out3);
				System.out.println("更新成功" + outFile3);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 得到当前类的路径
	 *
	 * @param clazz
	 * @return
	 */
	public static String getClassFilePath(Class<?> clazz) {
		try {
			return java.net.URLDecoder.decode(getClassFile(clazz).getAbsolutePath(), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 取得当前类所在的文件
	 *
	 * @param clazz
	 * @return
	 */
	public static File getClassFile(Class<?> clazz) {
		URL path = clazz.getResource(clazz.getName().substring(clazz.getName().lastIndexOf(".") + 1) + ".classs");
		if (path == null) {
			String name = clazz.getName().replaceAll("[.]", "/");
			path = clazz.getResource("/" + name + ".class");
		}
		return new File(path.getFile());
	}

	/**
	 * 首字母转小写
	 *
	 * @param s
	 * @return
	 */
	public static String toLowerCaseFirstOne(String s) {
		if (Character.isLowerCase(s.charAt(0))) {
			return s;
		} else {
			return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
		}
	}

	/**
	 * 首字母转大写
	 *
	 * @param s
	 * @return
	 */
	public static String toUpperCaseFirstOne(String s) {
		if (Character.isUpperCase(s.charAt(0))) {
			return s;
		} else {
			return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
		}
	}


	/**
	 * 判断一个类是否为基本数据类型。
	 *
	 * @param clazz 要判断的类。
	 * @return true 表示为基本数据类型。
	 */
	protected boolean isBaseDataType(Class<?> clazz) throws Exception {
		return (clazz.equals(String.class) || clazz.equals(Integer.class) || clazz.equals(Byte.class)
				|| clazz.equals(Long.class) || clazz.equals(Double.class) || clazz.equals(Float.class)
				|| clazz.equals(Character.class) || clazz.equals(Short.class) || clazz.equals(BigDecimal.class)
				|| clazz.equals(BigInteger.class) || clazz.equals(Boolean.class) ||
				// clazz.equals(Date.class) ||
//                clazz.equals(Money.class) ||
				clazz.isEnum() || clazz.isPrimitive());
	}
}
