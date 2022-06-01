package com.employee.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		  Assembly assem = (Assembly) context.getBean("assembly");
		  System.out.println(assem.getId());
		  System.out.println(assem.getName());
		  System.out.println(assem.getAddress());
		  System.out.println(assem.getNum());
		  System.out.println(assem);

	}

}
