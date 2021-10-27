package com.example.Employee;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Test {  
public static void main(String[] args) {  
	ApplicationContext context =new ClassPathXmlApplicationContext("Emp.xml");  
    EmployeeConstructor e=(EmployeeConstructor)context.getBean("obj");  
    //e.SetData("Raj",46368); 
    //e.show();
    
    e.show();
}  
}  