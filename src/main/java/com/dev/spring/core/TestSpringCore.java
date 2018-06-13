package com.dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringCore 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"/person.xml");
		Person p = context.getBean("person",Person.class);
		p.getJob().doJob();

	}
}
