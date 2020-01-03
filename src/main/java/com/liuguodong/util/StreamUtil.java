package com.liuguodong.util;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流工具类
 * @author: Lenovo
 * @date: 2020年1月3日 下午2:10:01
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

//	读取文件
	public static List<String> readLine(InputStream in){
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
		String str = null;
		try {
			while ((str=bufferedReader.readLine())!=null) {
				list.add(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
