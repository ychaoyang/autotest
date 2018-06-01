package com.autotest.utils;

/**
 * Created by yu on 17/11/15.
 */
public class StringUtils {

	public static boolean isBlank(String str) {
		return str == null || str.trim().isEmpty();
	}

	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}
}
