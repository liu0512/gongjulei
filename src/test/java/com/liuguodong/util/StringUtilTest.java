package com.liuguodong.util;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

public class StringUtilTest {
	
	
	@Test
  public void testIsHttpUrl() {
		
	//	String url="abc";//���Ϸ�
		String url="https://www.baidu.com";//�Ϸ�
		boolean b = StringUtil.isHttpUrl(url);
	  System.out.println(b);
  }

	@Test
	public void testHasLength() {
		boolean b =StringUtil.hasLength(" ");
		System.out.println(b);
	}
	@Test
	public void testHasText() {
		boolean b =StringUtil.hasText(" . ");
		System.out.println(b);
	}
	@Test
	public void testRandomChineseString2() {
		String name = StringUtil.randomChineseString();
		System.out.println(name);
	}
	@Test
	public void testRandomChineseString() {
		String name = StringUtil.randomChineseString(1000);
		System.out.println(name);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	
	@Test
	public void testIsPhoneNumber() {
		
		boolean b = StringUtil.isPhoneNumber("138123456789");
		System.out.println(b);
		
	}
	@Test
	public void testIsEMail() {
		
	//	boolean b = StringUtil.isEMail("number2000@163.com");
			boolean b = StringUtil.isEMail("2345678@qqcom");
		System.out.println(b);
		
	}
	
	

}
