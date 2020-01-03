package com.liuguodong.util;
/**
 * 
 * @ClassName: NumberUtil 
 * @Description: 数字工具类
 * @author: Lenovo
 * @date: 2020年1月3日 下午2:19:50
 */
public class NumberUtil {

//	判断是否为数字
	public static boolean isNumber(String str) {
		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		return str.matches(reg);
	}
}
