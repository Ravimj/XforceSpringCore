package com.dev.spring.core.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEngine {

	public static void main(String[] args) 
	{
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigEngine.class);
		Car c = context.getBean("car",Car.class);
		c.getEngine().engine();
	}

}
