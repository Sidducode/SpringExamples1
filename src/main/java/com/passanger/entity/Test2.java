package com.passanger.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/passanger/entity/config2.xml");
		Passanger pass = (Passanger) context.getBean("passDetails");
		System.out.println(pass);
	}

}
