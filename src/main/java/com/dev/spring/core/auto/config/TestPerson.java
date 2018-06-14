package com.dev.spring.core.auto.config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigPerson.class);
		Person p1 = context.getBean(Person.class);
		p1.getJob().doWork();
		context.close();
	}
}
