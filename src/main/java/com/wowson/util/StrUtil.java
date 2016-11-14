package com.wowson.util;

public class StrUtil {
	/**
	 * 去除首尾的空格，回车
	 * @param src
	 * @return
	 */
	public static String trimEx(String src){
		return src.replaceAll("([\\r\\n\\s]*)|([\\r\\n\\s]*)", "");
	}
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		boolean flag = false;
		if("".equals(str) && str.equals(null))
			flag = true;
		return flag;
	}
	/**
	 * 判断字符串是否为空不为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		boolean flag = true;
		if("".equals(str) && str.equals(null))
			flag = false;
		return flag;
	}
}
