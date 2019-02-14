package cn.itcast.ssm.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1、测试
 * 项目名称：shrio 
 * 类名称：Test
 * 开发者：Lenovo
 * 开发时间：2019年2月14日下午7:20:51
 */
public class Test {

	public static String test() {
		List<String> list = new ArrayList<>();
		list.clear();
		list.add("join");
		list.add("sex");
		list.add("age");
		
		List<String> asList = Arrays.asList(new String[]{"joins","sex"});
		for (int i = 0; i < list.size(); i++) {
			if(asList.contains(list.get(i))) {
				return list.get(i).toString();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		String test = Test.test();
		System.out.println(test);
	}
}
