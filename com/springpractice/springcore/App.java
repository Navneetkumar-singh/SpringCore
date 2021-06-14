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
		//git remote add origin https://github.com/Navneetkumar-singh/SpringCore.git
		//git branch -M main
		//git push -u origin main
		//HERE THE BEAN IS CREATED AND INJECTION IS DONE BY CONSTRUCTOR
	student2 student2obj=	context.getBean("student2bean",student2.class);
	System.out.println(student2obj.toString());
	}}
