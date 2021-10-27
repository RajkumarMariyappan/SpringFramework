package com.basic.Annotation;

import org.springframework.stereotype.Component;

@Component 
public class Bike implements Vechicle {
public void sound() {
	System.out.println("dubu dubu....");
}
}
