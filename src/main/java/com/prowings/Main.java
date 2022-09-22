package com.prowings;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorld hw = (HelloWorld) ctx.getBean("helloWorld");
		HelloWorld hw1 = (HelloWorld) factory.getBean("helloWorld");
		int count=ctx.getBeanDefinitionCount();
		System.out.println(count);
		
		//Student student = (Student) ctx.getBean("std");
		
		Employee emp = (Employee) ctx.getBean("emp");
		
//		System.out.println(hw);
//		System.out.println(student);
		System.out.println(emp);
	}

}
