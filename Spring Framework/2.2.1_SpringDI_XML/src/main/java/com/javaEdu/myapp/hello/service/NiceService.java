package com.javaEdu.myapp.hello.service;

import org.springframework.stereotype.Service;

@Service
public class NiceService implements IHelloService{

	@Override
	public String sayHello(String name) {
		System.out.println("NiceService.sayHello() �޼��� ����");
		String message = "Hello ~~~" + name;
		return message;
	}
}