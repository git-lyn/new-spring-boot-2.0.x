package com.lyn.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring-boot-build
 * @author: lyn
 * * @create: 2020-07-29 23:12
 **/
@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/test")
	public Object test(){
		Map<String, String> map = new HashMap<>();
		map.put("aa", "dsfsffd");
		System.out.println(34343434);
		return map;
	}
}
