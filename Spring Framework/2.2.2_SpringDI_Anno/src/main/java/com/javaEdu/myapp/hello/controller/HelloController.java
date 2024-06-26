package com.javaEdu.myapp.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.javaEdu.myapp.hello.service.IHelloService;

@Controller
public class HelloController {
	
	@Autowired
	@Qualifier("helloService")
	IHelloService service;
	
	public void hello(String name) {
		System.out.println("@HelloController : " + service.sayHello(name));
	}

}
