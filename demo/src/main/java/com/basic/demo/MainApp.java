package com.basic.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beann.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		obj.show();
	}
}
