package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.ssm.po.ItemsCustom;

/**
 * 1、json测试
 * 项目名称：shrio 
 * 类名称：JsonTest
 * 开发者：Lenovo
 * 开发时间：2019年2月14日下午7:43:58
 */
@Controller
public class JsonTest {

		//请求的json响应json，请求商品信息，商品信息用json格式，输出商品信息
		@RequestMapping("/requestJson")
		public @ResponseBody ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom)throws Exception{
			
			
			return itemsCustom;
			
		}
		
	
		//请求key/value响应json
		@RequestMapping("/responseJson")
		public @ResponseBody ItemsCustom responseJson(ItemsCustom itemsCustom)throws Exception{
			
			return itemsCustom;
		}
}
