package com.dev.spring.core.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringCore 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigPerson.class);
		Person p = context.getBean("person",Person.class);
		p.getJob().doJob();
	}
}