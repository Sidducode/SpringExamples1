package com.student.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/student/entity/config1.xml");
		
		      Student bean = (Student) context.getBean("stdDetails") ;
		      
		      System.out.println(bean);
		
	}

}
