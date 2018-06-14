package com.dev.spring.core.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigPerson {

	@Bean(name="person")
	public Person getPerson(){
		Person p = new Person();
		p.setName("Blake");
		p.setJob(getJob());
		return p;
	}
	
	@Bean(name="job")
	public Job getJob(){
		Job j = new SoftwareTester();
		return j;
	}
}