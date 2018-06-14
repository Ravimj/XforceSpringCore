package com.dev.spring.core.auto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("car")
//@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Car {
	
	private String model = "Blake";
	private ModeOfEngine mode;
	
	Car(){}
	
	@Autowired
	Car(ModeOfEngine m){
		this.mode =m;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String name) {
		this.model = name;
	}
	public ModeOfEngine getMode() {
		return mode;
	}
	public void setMode(ModeOfEngine m1) {
		this.mode = m1;
	}
	
	
	
}

