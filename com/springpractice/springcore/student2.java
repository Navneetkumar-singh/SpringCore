package com.springpractice.springcore;

public class student2 {
private String name;
private int rollno;
private int age;
public student2(String name, int rollno, int age) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.age = age;
	System.out.println("Construtor is called");
}
@Override
public String toString() {
	return "student2 [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
}
}
