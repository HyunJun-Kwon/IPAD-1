package com.javaEdu.myapp.hello.service;

public class HelloService implements IHelloService{
	
	@Override
	public String sayHello(String name) {
		System.out.println("HelloService.sayHello() 매서드 실행");
		String message = "Hello ~~" + name;
		return message;
	}
}
