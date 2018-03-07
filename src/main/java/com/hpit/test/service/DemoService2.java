package com.hpit.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpit.test.bean.Demo;
import com.hpit.test.dao.DemoDaoUseJdbcTemplate;

@Service("demoService2")
public class DemoService2 {
	@Autowired
	private DemoDaoUseJdbcTemplate daoUseJdbcTemplate;
	
	public Demo getById(Integer id){
		return daoUseJdbcTemplate.getById(id);
	}
}
