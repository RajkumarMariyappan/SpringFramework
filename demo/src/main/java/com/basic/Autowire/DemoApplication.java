package com.basic.Autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = SpringApplication.run(com.basic.Autowire.DemoApplication.class, args);
		Alien a = (Alien) context.getBean(Alien.class);
		a.show();

//		Alien a1=(Alien)context.getBean(Alien.class);
//		a1.show();
	}

}
