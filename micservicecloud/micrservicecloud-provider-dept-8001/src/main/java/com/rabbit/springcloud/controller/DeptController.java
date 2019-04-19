package com.rabbit.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.springcloud.entities.Dept;
import com.rabbit.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept) {
		return deptService.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}
	/**
	 * 获取该服务信息
	 * @return
	 */
	@RequestMapping(value = "/dept/discovery", method=RequestMethod.GET)
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println("**********"+list);
		
		List<ServiceInstance> servList = client.getInstances("microservicecloud-dept");
		for (ServiceInstance serviceInstance : servList) {
			System.out.println(serviceInstance.getServiceId() + "\t" + serviceInstance.getHost() + "\t" + serviceInstance.getPort() + "\t"
			         + serviceInstance.getUri());
		}
		return this.client;
	}
}
