package com.autotest.generate;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * Created by huairen on 2017/8/17.
 */
public class GenerateBaseFile {

	protected final static Logger log = LoggerFactory.getLogger(GenerateBaseFile.class);

	public static void main(String[] args) {
		String projectName = "platfrompay";

		new GenerateBaseFile().generateBaseFile(projectName, "huairen", false, GenerateBaseFile.class);

	}


	/**
	 * 根据项目名称生成base类
	 *
	 * @param projectName
	 * @return
	 */
	public void generateBaseFile(String projectName, String author, boolean covered, Class<?> cla) {
		try {
			// Class<?> cla = Class.forName(clazzName);
			// 从包路径获取全部DOclass类
			Set<Class<?>> cls = getClasses("dal.model." + projectName);
			List<Map<String, Object>> tableList = new ArrayList<>();
			for (Class<?> c : cls) {
				if (!c.getName().contains("Example")) {
					System.out.println(c.getName());
					Map<String, Object> table = new HashMap<String, Object>();
					table.put("tableName", c.getSimpleName().replace("DO", ""));
					List<Param> pars = new ArrayList<>();
					Field[] fields = c.getDeclaredFields();
					for (Field f : fields) {
						if ("serialVersionUID".equals(f.getName())) {
							continue;
						}
						Param par = new Param();
						par.setName(f.getName());
						par.setTypeName(f.getType().getSimpleName());
						if ("Long".equals(f.getType().getSimpleName())) {
							par.setTypeName("long");
						}
						Column column = f.getAnnotation(Column.class);
						if (null != column) {
							String clumnName = column.name();
							if (clumnName.split("_").length > 1 && clumnName.split("_")[0].length() == 1) {
								par.setAnnotation(column.name());
							}
						}
						pars.add(par);
					}
					table.put("pars", pars);
					tableList.add(table);
				}
			}
			// AutoTestBase类
			String className = toUpperCaseFirstOne(projectName) + "TestBase";
			String filePath = Thread.currentThread().getContextClassLoader().getResource("ftl/").getPath()
					.replace("/target/test-classes", "/src/test/resources");
			String outFile = getClassFilePath(cla).replace("\\target\\classes", "\\src\\test\\java")
					.replace(cla.getSimpleName() + ".class", className + ".java");
			String packageName = cla.getPackage().getName();
			Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);
			cfg.setDirectoryForTemplateLoading(new File(filePath));
			cfg.setDefaultEncoding("UTF-8");
			cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

			Map<String, Object> root = new HashMap<String, Object>();
			root.put("packageName", packageName);
			root.put("projectName", projectName);
			root.put("className", className);
			root.put("time", new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
			root.put("author", author);
			root.put("tableList", tableList);
			if (covered || !new File(outFile).exists()) {
				Template template = cfg.getTemplate("generateTestBase.ftl");
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
				template.process(root, out);
				System.out.println("更新成功" + outFile);
			}

			// DataSourceConfig类
			String className3 = toUpperCaseFirstOne(projectName) + "DataSourceConfig";
			String outFile3 = getClassFilePath(cla).replace("\\target\\classes", "\\src\\test\\java")
					.replace("testbase\\" + cla.getSimpleName() + ".class", "datasource\\"
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
	 * 从包package中获取所有的Class
	 *
	 * @param pack
	 * @return
	 */
	public static Set<Class<?>> getClasses(String pack) {

		// 第一个class类的集合
		Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
		// 是否循环迭代
		boolean recursive = true;
		// 获取包的名字 并进行替换
		String packageName = pack;
		String packageDirName = packageName.replace('.', '/');
		// 定义一个枚举的集合 并进行循环来处理这个目录下的things
		Enumeration<URL> dirs;
		try {
			dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
			// 循环迭代下去
			while (dirs.hasMoreElements()) {
				// 获取下一个元素
				URL url = dirs.nextElement();
				// 得到协议的名称
				String protocol = url.getProtocol();
				// 如果是以文件的形式保存在服务器上
				if ("file".equals(protocol)) {
//                    System.err.println("file类型的扫描");
					// 获取包的物理路径
					String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
					// 以文件的方式扫描整个包下的文件 并添加到集合中
					findAndAddClassesInPackageByFile(packageName, filePath, recursive, classes);
				} else if ("jar".equals(protocol)) {
					// 如果是jar包文件
					// 定义一个JarFile
//                    System.err.println("jar类型的扫描");
					JarFile jar;
					try {
						// 获取jar
						jar = ((JarURLConnection) url.openConnection()).getJarFile();
						// 从此jar包 得到一个枚举类
						Enumeration<JarEntry> entries = jar.entries();
						// 同样的进行循环迭代
						while (entries.hasMoreElements()) {
							// 获取jar里的一个实体 可以是目录 和一些jar包里的其他文件 如META-INF等文件
							JarEntry entry = entries.nextElement();
							String name = entry.getName();
							// 如果是以/开头的
							if (name.charAt(0) == '/') {
								// 获取后面的字符串
								name = name.substring(1);
							}
							// 如果前半部分和定义的包名相同
							if (name.startsWith(packageDirName)) {
								int idx = name.lastIndexOf('/');
								// 如果以"/"结尾 是一个包
								if (idx != -1) {
									// 获取包名 把"/"替换成"."
									packageName = name.substring(0, idx).replace('/', '.');
								}
								// 如果可以迭代下去 并且是一个包
								if ((idx != -1) || recursive) {
									// 如果是一个.class文件 而且不是目录
									if (name.endsWith(".class") && !entry.isDirectory()) {
										// 去掉后面的".class" 获取真正的类名
										String className = name.substring(packageName.length() + 1, name.length() - 6);
										try {
											// 添加到classes
											classes.add(Class.forName(packageName + '.' + className));
										} catch (ClassNotFoundException e) {
											// log
											// .error("添加用户自定义视图类错误
											// 找不到此类的.class文件");
											e.printStackTrace();
										}
									}
								}
							}
						}
					} catch (IOException e) {
						// log.error("在扫描用户定义视图时从jar包获取文件出错");
						e.printStackTrace();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return classes;
	}

	/**
	 * 以文件的形式来获取包下的所有Class
	 *
	 * @param packageName
	 * @param packagePath
	 * @param recursive
	 * @param classes
	 */
	public static void findAndAddClassesInPackageByFile(String packageName, String packagePath, final boolean
			recursive,
														Set<Class<?>> classes) {
		// 获取此包的目录 建立一个File
		File dir = new File(packagePath);
		// 如果不存在或者 也不是目录就直接返回
		if (!dir.exists() || !dir.isDirectory()) {
			// log.warn("用户定义包名 " + packageName + " 下没有任何文件");
			return;
		}
		// 如果存在 就获取包下的所有文件 包括目录
		File[] dirfiles = dir.listFiles(new FileFilter() {
			// 自定义过滤规则 如果可以循环(包含子目录) 或则是以.class结尾的文件(编译好的java类文件)
			@Override
			public boolean accept(File file) {
				return (recursive && file.isDirectory()) || (file.getName().endsWith(".class"));
			}
		});
		// 循环所有文件
		for (File file : dirfiles) {
			// 如果是目录 则继续扫描
			if (file.isDirectory()) {
				findAndAddClassesInPackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(), recursive,
						classes);
			} else {
				// 如果是java类文件 去掉后面的.class 只留下类名
				String className = file.getName().substring(0, file.getName().length() - 6);
				try {
					// 添加到集合中去
					// classes.add(Class.forName(packageName + '.' +
					// className));
					classes.add(
							Thread.currentThread().getContextClassLoader().loadClass(packageName + '.' + className));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}


	/**
	 * 循环向上转型, 获取对象的 DeclaredField
	 *
	 * @param
	 * @param
	 * @return
	 */

	public List<Field> getClassAllFields(Class<?> clazz, List<Field> allGenericFields) {

		// 如果clazz为空则直接返回
		if (clazz == null) {
			return allGenericFields;
		}
		Object parent = clazz.getGenericSuperclass();
		// 如果有父类并且父类不是Object 则递归调用
		if (parent != null && !((Class<?>) parent).getName().equals("Object")) {
			getClassAllFields((Class<?>) parent, allGenericFields);
		}
		Field[] fields = clazz.getDeclaredFields();
		if (fields != null) {// 如果clazz存在声明的属性
			for (int i = 0; i < fields.length; i++)
				allGenericFields.add(fields[i]);
		}

		return allGenericFields;
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