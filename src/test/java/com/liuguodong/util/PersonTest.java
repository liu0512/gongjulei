package com.liuguodong.util;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		
		for (int i = 0; i < 10000; i++) {
		
		 Person p = new Person();
		  // ��������ֵ����StringUtil.generateChineseName()������4�֣�
		 p.setName(StringUtil.generateChineseName());
	        //��������ֵ����RandomUtil.random()������������1-120��֮�䣨4�֣�
		 p.setAge(RandomUtil.random(1, 120));
			//��������ֵ����StringUtil.randomChineseString()����������Ϊ140��������֣�4�֣�
		 p.setAbout(StringUtil.randomChineseString(140));
			//ע����������ֵģ��2010��1��1�������������ʱ�䣨4�֣���
		 
		 Calendar c = Calendar.getInstance();
		 c.set(2010, 0, 1);
		 p.setCreated(DateUtil.randomDate(c.getTime(), new Date()));
		 System.out.println(p);
		}
	}

	
	
}
