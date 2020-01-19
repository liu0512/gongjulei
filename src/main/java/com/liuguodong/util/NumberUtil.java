package com.liuguodong.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

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

//  计算百分比 整数
	public static String proportionInt(Integer divisor, Integer dividend) {
		if (dividend == null || divisor == null)
			return null;
		NumberFormat numberFormat = NumberFormat.getInstance();
// 		设置精确到小数点后2位
		numberFormat.setMaximumFractionDigits(2);
		String result = numberFormat.format((float) divisor / (float) dividend * 100);
		if (result.indexOf(".") != -1) {
			result = Math.round(Double.parseDouble(result)) + "%";
		}
		return result;
	}

	
//	计算百分比 整数
	public static String proportionInt(Float divisor, Float dividend) {
		if (dividend == null || divisor == null)
			return null;
		NumberFormat numberFormat = NumberFormat.getInstance();
// 		设置精确到小数点后2位
		numberFormat.setMaximumFractionDigits(2);
		String result = numberFormat.format(divisor / dividend * 100);
		if (result.indexOf(".") != -1) {
			result = Math.round(Double.parseDouble(result)) + "%";
		}
		return result;
	}

//	 计算百分比 保留留n位小数
	public static String proportionDouble(Integer divisor, Integer dividend, Integer bit) {
		if (dividend == null || divisor == null || bit == null)
			return null;
		NumberFormat numberFormat = NumberFormat.getInstance();
// 		设置精确到小数点后2位
		numberFormat.setMaximumFractionDigits(bit);
		String result = numberFormat.format((float) divisor / (float) dividend * 100);

		return result + "%";
	}

//	计算百分比 保留留n位小数
	public static String proportionDouble(Float divisor, Float dividend, Integer bit) {
		if (dividend == null || divisor == null || bit == null)
			return null;
		NumberFormat numberFormat = NumberFormat.getInstance();
// 		设置精确到小数点后2位
		numberFormat.setMaximumFractionDigits(bit);
		String result = numberFormat.format(divisor / dividend * 100);

		return result + "%";
	}

//	保留n为小数
	public static Double doubleBit(Double d, Integer bit) {
		if (d == null || bit == null)
			return null;
		BigDecimal bg = new BigDecimal(d).setScale(bit, RoundingMode.DOWN);
		return bg.doubleValue();
	}

//	保留n位小数,小数不足补0
	public static Double doubleBitWhole(Double d, Integer bit) {
		if (d == null || bit == null)
			return null;
		BigDecimal bg = new BigDecimal(d).setScale(bit, RoundingMode.DOWN);
		String dobu = bg.doubleValue() + "";
		if (dobu.indexOf(".") != -1) {
			String small = dobu.split("\\.")[1];
			for (int i = 0; i < bit - small.length(); i++) {
				dobu += "0";
			}

		}
		return Double.parseDouble(dobu);
	}
}
