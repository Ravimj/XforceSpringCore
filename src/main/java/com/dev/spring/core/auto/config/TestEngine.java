package com.dev.spring.core.auto.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEngine 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigEngine.class);
		Car c = context.getBean(Car.class);
		c.getMode().engine();
		context.close();
	}
}