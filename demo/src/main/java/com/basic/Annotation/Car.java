package com.basic.Annotation;

import org.springframework.stereotype.Component;

@Component 
public class Car implements Vechicle {
	public void sound() {
		System.out.println("Jiiing....");
	}
}
