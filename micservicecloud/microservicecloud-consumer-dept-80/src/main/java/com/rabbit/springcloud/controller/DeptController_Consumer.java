package com.rabbit.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rabbit.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {

	//private String REST_URL_PREFIX = "http://localhost:8001";
	//换成服务名
	private String REST_URL_PREFIX = "http://microservicecloud-dept";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		/*
		 * 使用restTemplate访问restful接口非常的简单粗暴无脑。
		(url, requestMap, ResponseBean.class)这三个参数分别代表 
		REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
		 */
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}
	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		/*
		 * 使用restTemplate访问restful接口非常的简单粗暴无脑。
		(url, requestMap, ResponseBean.class)这三个参数分别代表 
		REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
		 */
		return restTemplate.getForObject(REST_URL_PREFIX+ "/dept/get/"+id, Dept.class);
	}
	@RequestMapping("/consumer/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX+"dept/discovery", Object.class);
	}
}
