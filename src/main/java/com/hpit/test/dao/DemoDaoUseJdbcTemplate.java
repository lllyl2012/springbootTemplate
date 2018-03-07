package com.hpit.test.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hpit.test.bean.Demo;

@Repository("demoDao1")
public class DemoDaoUseJdbcTemplate {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Demo getById(Integer id){
		String sql = "select * from demo where id = ?";
		//获取数据映射
		RowMapper<Demo> mapper = new BeanPropertyRowMapper<>(Demo.class);
		return jdbcTemplate.queryForObject(sql, mapper,id);
	}
}
