package com.dev.spring.core.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigEngine 
{	
	@Bean(name="car")
	public Car getCar(){
		Car c = new Car();
		c.setModel("Blake");
		c.setEngine(getEngine());
		return c;
	}

	@Bean(name="engine")
	public ModeOfEngine getEngine(){
		ModeOfEngine j = new StartEngine();
		return j;
	}
}
