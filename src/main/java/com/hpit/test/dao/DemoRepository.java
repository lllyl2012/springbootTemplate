package com.hpit.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.hpit.test.bean.Demo;

public interface DemoRepository extends CrudRepository<Demo, Integer>{
	
}
