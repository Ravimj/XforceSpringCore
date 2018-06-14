package com.dev.spring.core.auto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("person")
//@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Person {
	
	private String name = "Blake";
	private Job job;
	
	Person(){}
	
	@Autowired
	Person(Job j){
		this.job = j;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	
	
}
