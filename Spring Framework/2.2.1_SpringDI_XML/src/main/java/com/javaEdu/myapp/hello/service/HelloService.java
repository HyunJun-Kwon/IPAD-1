package com.javaEdu.myapp.hello.service;

public class HelloService implements IHelloService{
	
	@Override
	public String sayHello(String name) {
		System.out.println("HelloService.sayHello() �ż��� ����");
		String message = "Hello ~~" + name;
		return message;
	}
}
