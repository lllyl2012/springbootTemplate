package com.hpit.test.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hpit.test.bean.Demo;
import com.hpit.test.dao.DemoRepository;

@Service
public class DemoService {
	@Autowired
	private DemoRepository demoRepository;
	@Transactional
	public void save(Demo demo){
		demoRepository.save(demo);
	}
}
