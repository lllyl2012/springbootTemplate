package com.hpit.test.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hpit.test.bean.Demo;
import com.hpit.test.service.DemoService;

@RestController
@RequestMapping("/demo2")
public class DemoController {
	@Autowired
	private DemoService demoService;
	@ResponseBody
	@RequestMapping("/save")
	public String save(){
		demoService.save(new Demo("angle2"));
		return "ok the data was saved aaaa";
	}
}
