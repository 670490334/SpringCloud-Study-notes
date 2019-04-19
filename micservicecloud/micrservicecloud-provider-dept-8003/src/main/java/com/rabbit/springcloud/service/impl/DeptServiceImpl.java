package com.rabbit.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.springcloud.dao.DeptDao;
import com.rabbit.springcloud.entities.Dept;
import com.rabbit.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	@Override
	public boolean add(Dept dept) {
		boolean addDept = deptDao.addDept(dept);
		return addDept;
	}

	@Override
	public Dept get(Long id) {
		Dept dept = deptDao.findById(id);
		return dept;
	}

	@Override
	public List<Dept> list() {
		List<Dept> deptList = deptDao.findAll();
		return deptList;
	}

}
