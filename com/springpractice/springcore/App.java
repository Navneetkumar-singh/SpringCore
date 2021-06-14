package com.springpractice.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("ioc container created");
		student student=context.getBean("studentbean",student.class);
		student.getAge();
		student.getRollno();
		student.getRollno();
		System.out.println("bean is successfully created and values and injected by using setter methods");
//Setter method is called three times which shows that for injection it is using setter methods
	}}
