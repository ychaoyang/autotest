package com.autotest.generate;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by huairen on 2018/5/22.
 */
public class GenerateFacadeCase extends GenerateBaseFile {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getName());


	/**
	 * 生成测试代码
	 */
	public void generate(Class<?> facadeCla, String methodName, String packag, String author, Class<?> claz) {
		String resultType = "";
		String resultName = "";
		String orderType = "";
		String orderName = "";
		String facadeType = facadeCla.getTypeName();

		String facadeName = facadeCla.getSimpleName();
		Method[] methods = facadeCla.getDeclaredMethods();
		int time = 0;
		for (Method m : methods) {
			if (!"all".equals(methodName)) {
				if (null != methodName && !methodName.equals(m.getName())) {
					continue;
				}
			}
			time++;
			resultType = m.getReturnType().getName();
			System.out.println(resultType);
			resultName = m.getReturnType().getSimpleName();
			System.out.println(resultName);
			// 参数
			List<Param> pars = new ArrayList<>();
			// order
			List<Param> pars_order = new ArrayList<>();
			Parameter[] parameters = m.getParameters();
			for (Parameter p : parameters) {
				orderType = p.getType().getName();
				orderName = p.getName();
				if (orderType.contains("UniformStringQueryOrder")) {
					break;
				}
				Param parameter = new Param();
				parameter.setName(orderName);
				parameter.setSecondName(orderName);
				parameter.setType(orderType);
				parameter.setTypeName(orderType.split("\\.")[orderType.split("\\.").length - 1]);
				parameter.setLayer(0);
				Class<?> cla = p.getType();
				try {
					if (isBaseDataType(cla)) {
						parameter.setPrimitive("yes");
						pars.add(parameter);
						continue;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				pars_order.add(parameter);

				List<Field> allGenericFields = new ArrayList<Field>();
				allGenericFields = getClassAllFields(cla, allGenericFields);
				for (Field f : allGenericFields) {
					System.out.println(f.getName());
					if ("serialVersionUID".equals(f.getName())) {
						continue;
					}
					// 设置允许访问
					f.setAccessible(true);
					Param par = new Param();
					par.setName(f.getName());
					par.setType(f.getType().getName());
					par.setTypeName(f.getType().getName().split("\\.")[f.getType().getName().split("\\.").length - 1]);
					par.setFather(orderName);
					par.setOrder(orderName);
					par.setLayer(1);
					try {
						if (isBaseDataType(f.getType())) {
							par.setPrimitive("yes");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					for (Annotation ann : f.getDeclaredAnnotations()) {
						if ("NotBlank".equals(ann.annotationType().getSimpleName())
								|| "NotEmpty".equals(ann.annotationType().getSimpleName())
								|| "NotNull".equals(ann.annotationType().getSimpleName())) {
							par.setAnnotation("NotNull");
						}
					}
					if ("List".equals(f.getType().getSimpleName())) {
						Type t = f.getGenericType();
						if (t instanceof ParameterizedType) {
							ParameterizedType pt = (ParameterizedType) t;
							Class<?> clz = (Class<?>) pt.getActualTypeArguments()[0];
							par.setChildren(toLowerCaseFirstOne(
									clz.getName().split("\\.")[clz.getName().split("\\.").length - 1]));
							par.setChildrenCLass(clz.getName());
							// 向pars里加参数
							addParameter(clz, par, pars);
						}
					}
					try {
						if (!isBaseDataType(f.getType()) && f.getType().getSimpleName().contains("Order")) {
							// 向pars里加参数
							addParameter(f.getType(), par, pars);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					pars.add(par);
				}
			}
			// 第三层参数
			ArrayList<String> ls = new ArrayList<>();
			for (int j = 0; j < pars.size(); j++) {
				Param p = pars.get(j);
				if (2 == p.getLayer() && "List".equals(p.getTypeName()) && !ls.contains(p.getChildren())) {
					Class<?> cl = null;
					try {
						cl = Class.forName(p.getChildrenCLass());
					} catch (ClassNotFoundException e2) {
						e2.printStackTrace();
					}
					addParameter(cl, p, pars);
					ls.add(p.getChildren());
				}
			}
			for (Param p : pars) {
				if (null == p.getSecondName()) {
					p.setSecondName(p.getName());
				}
				System.out.println(p);
			}
			// 形参
			ArrayList<String> childlist = new ArrayList<>();
			for (Param p : pars) {
				try {
					if (p.getFather() == null
							&& !childlist.contains(p.getName())
							&& !isBaseDataType(Class.forName(p.getType()))) {
						childlist.add(p.getName());
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			for (int j = 0; j < childlist.size(); j++) {
				for (Param p : pars) {
					if (null == p.getOrder() || "List".equals(p.getTypeName()) || "Date".equals(p.getTypeName())) {
						childlist.remove(p.getSecondName());
					}
				}
			}
			System.out.println(childlist);
			// pars_order
			Set<String> orderlist = new HashSet<>();
			for (int i = 0; i < pars.size(); i++) {
				Param para = pars.get(i);
				if (null != para.getChildrenCLass()) {
					Param par = new Param();
					par.setName(toLowerCaseFirstOne(
							para.getChildrenCLass().split("\\.")[para.getChildrenCLass().split("\\.").length - 1]));
					par.setSecondName(para.getSecondName() + "_" + par.getName());
					par.setTypeName(
							para.getChildrenCLass().split("\\.")[para.getChildrenCLass().split("\\.").length - 1]);
					par.setType(para.getChildrenCLass());
					par.setFather(para.getSecondName());
					par.setLayer(para.getLayer());
					if (null == par.getName() || null == par.getTypeName()) {
						continue;
					}
					if (2 == par.getLayer() && orderlist.contains(par.getName())) {
						continue;
					}
					orderlist.add(par.getName());
					pars_order.add(par);
				}
				if (null == para.getPrimitive() && para.getTypeName().contains("Order")) {
					orderlist.add(para.getName());
					pars_order.add(para);
				}
			}
			System.out.println(orderlist);
			System.out.println(pars_order);
			Set<String> importlist = new HashSet<>();
			for (Param p : pars_order) {
				importlist.add(p.getType());
			}

			// 类名
			String className = toUpperCaseFirstOne(facadeName) + toUpperCaseFirstOne(m.getName()) + "Test";
			String filePath = Thread.currentThread().getContextClassLoader()
					.getResource("ftl/").getPath().replace("/target/test-classes",
							"/src/test/resources");
			String outFile = getClassFilePath(claz)
					.replace("\\target\\classes", "\\src\\test\\java")
					.replace("\\target\\test-classes", "\\src\\test\\java")
					.replace(claz.getName().split("\\.")[claz.getName().split("\\.").length - 1] + ".class",
							packag.replace(".", "\\") + "\\");
			String packageName = "com.autotest." + packag.replace("/", ".");
			String projectName = packag.indexOf(".") == -1 ? packag : packag.substring(0, packag.indexOf("."));
			Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);
			try {
				cfg.setDirectoryForTemplateLoading(new File(filePath));

				cfg.setDefaultEncoding("UTF-8");
				cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

				Map<String, Object> root = new HashMap<String, Object>();
				root.put("packageName", packageName);
				root.put("projectName", projectName);
				root.put("className", className);
				root.put("funcName", toLowerCaseFirstOne(className));
				root.put("author", author);
				root.put("resultType", resultType);
				root.put("resultName", resultName);
				root.put("orderType", orderType);
				root.put("orderName", orderName);
				root.put("facadeName", facadeName);
				root.put("facadeType", facadeType);
				root.put("methodName", m.getName());
				root.put("time", new SimpleDateFormat("yyyy年MM月dd日").format(new Date()));
				root.put("importlist", importlist);
				root.put("pars", pars);
				root.put("pars_order", pars_order);
				root.put("childlist", childlist);
				ArrayList<String> baselist = new ArrayList<>();
				for (Param p : pars) {
					if (p.getFather() == null && !baselist.contains(p.getName())) {
						baselist.add(p.getName());
					}
				}
				for (Param p : pars_order) {
					if (0 == p.getLayer()) {
						baselist.add(p.getName());
					}
				}
				root.put("baselist", baselist);
				Template template;
				template = cfg.getTemplate("generateFacadeCase.ftl");
				File f = new File(outFile);
				if (!f.exists()) {
					f.mkdirs();
				}
				String classFile = outFile + className + ".java";
				if (new File(classFile).exists()) {
					log.error("该文件已存在，{}", classFile);
					throw new Exception("该文件已存在");
				}
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(classFile)));
				template.process(root, out);
				System.out.println("更新成功" + classFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (0 == time) {
			log.info("方法名未找到{}", methodName);
		}
	}


	/**
	 * 取得类所在的参数
	 *
	 * @param clazz
	 * @return
	 */
	public void addParameter(Class<?> clazz, Param parm, List<Param> list) {
		List<Field> fields = new ArrayList<Field>();
		fields = getClassAllFields(clazz, fields);
		for (Field f : fields) {
			if ("serialVersionUID".equals(f.getName())) {
				continue;
			}
			f.setAccessible(true);
			Param par = new Param();
			par.setName(f.getName());
			par.setType(f.getType().getName());
			par.setTypeName(f.getType().getName().split("\\.")[f.getType().getName().split("\\.").length - 1]);
			par.setOrder(clazz.getSimpleName());
			par.setLayer(parm.getLayer() + 1);
			par.setFather(parm.getName());
			try {
				if (isBaseDataType(f.getType())) {
					par.setPrimitive("yes");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (Annotation ann : f.getDeclaredAnnotations()) {
				if ("NotBlank".equals(ann.annotationType().getSimpleName())
						|| "NotEmpty".equals(ann.annotationType().getSimpleName())
						|| "NotNull".equals(ann.annotationType().getSimpleName())) {
					par.setAnnotation("NotNull");
				}
			}
			if (f.getGenericType() instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType) f.getGenericType();
				Class<?> clz = (Class<?>) pt.getActualTypeArguments()[0];// 得到对象list中实例的类型
				try {
					if (!isBaseDataType(clz)) {
						par.setChildren(toLowerCaseFirstOne(clz.getName().split("\\.")[clz.getName().split("\\.")
								.length - 1]));
						par.setChildrenCLass(clz.getName());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			list.add(par);
		}
	}

}
