package com.basic.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Vechicle obj=(Vechicle)context.getBean("bike");
		obj.sound();
	}

}
