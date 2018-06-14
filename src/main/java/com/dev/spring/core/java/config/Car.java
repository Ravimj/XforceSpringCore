package com.dev.spring.core.java.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

public class Car
{
	private String model;
	private String brand;
	private String type; 
	
	private ModeOfEngine engine;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ModeOfEngine getEngine() {
		return engine;
	}

	public void setEngine(ModeOfEngine engine) {
		this.engine = engine;
	}

	
}
