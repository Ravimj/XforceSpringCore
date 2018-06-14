package com.dev.spring.core.xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEngine {

	public static void main(String[] args) 
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"/Car.xml");
		Car c = context.getBean("car",Car.class);
		c.getEngine().engine();
	}

}
