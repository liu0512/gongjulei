package com.liuguodong.util;

import java.util.Collection;
/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 集合工具类
 * @author: Lenovo
 * @date: 2020年2月12日 下午2:38:43
 */
public class CollectionUtil {

//	判断集合是否为空
	public static boolean isEmpty(Collection<?> collection) {
		return collection == null || collection.size() == 0;
	}
}
