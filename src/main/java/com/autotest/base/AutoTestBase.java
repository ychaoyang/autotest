package com.autotest.base;

import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Created by huairen on 2017/7/20.
 */

public class AutoTestBase {

	protected final Logger logger = LoggerFactory.getLogger(AutoTestBase.class);

	protected RestTemplate restTemplate = new RestTemplate();

	/**
	 * 暂停*秒
	 *
	 * @param time
	 */
	protected static void sleep(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}




	protected void assertEquals(Object expected, Object actual) {
		Assertions.assertEquals(expected, actual);
	}

	protected void assertNotEquals(Object expected, Object actual) {
		Assertions.assertNotEquals(expected, actual);
	}

	protected void assertTrue(boolean condition) {
		Assertions.assertTrue(condition);
	}

	protected void assertFalse(boolean condition) {
		Assertions.assertFalse(condition);
	}

	protected void assertNull(Object actual) {
		Assertions.assertNull(actual);
	}

	protected void assertNotNull(Object actual) {
		Assertions.assertNotNull(actual);
	}


	/**
	 * 首字母转小写
	 *
	 * @param s
	 * @return
	 */
	protected String toLowerCaseFirstOne(String s) {
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
	protected String toUpperCaseFirstOne(String s) {
		if (Character.isUpperCase(s.charAt(0))) {
			return s;
		} else {
			return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
		}
	}

	/**
	 * 得到当前类的路径
	 *
	 * @param clazz
	 * @return
	 */
	protected String getClassFilePath(Class<?> clazz) {
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
	protected File getClassFile(Class<?> clazz) {
		URL path = clazz.getResource(clazz.getName().substring(clazz.getName().lastIndexOf(".") + 1) + ".classs");
		if (path == null) {
			String name = clazz.getName().replaceAll("[.]", "/");
			path = clazz.getResource("/" + name + ".class");
		}
		return new File(path.getFile());
	}

	protected void print(Object object) {
		String str = "";
		if (object instanceof List) {
			logger.info("========================================");
			List list = (List) object;
			logger.info("List size:" + list.size());
			for (int i = 0; i < list.size(); i++) {

				str = list.get(i).toString();
				logger.info(str);
			}
			logger.info("========================================");
			return;
		} else if (object == null) {

			str = "null";
		} else {
			str = object.toString();
		}

		logger.info("========================================");
		logger.info(str);
		logger.info("========================================");
	}
}
