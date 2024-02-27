package com.javaEdu.myapp.hello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService{

	@Override
	public String sayHello(String name) {
		System.out.println("HelloService.sayHello() ����Ϸ�");
		String message = "Hello ~~~~" + name;
		return message;
	}
}
