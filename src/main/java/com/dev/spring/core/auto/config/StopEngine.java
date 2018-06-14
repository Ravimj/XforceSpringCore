package com.dev.spring.core.auto.config;

import org.springframework.stereotype.Component;

@Component("stop")
public class StopEngine implements ModeOfEngine
{

	@Override
	public void engine()
	{
		System.out.println("car is stopped");
		
	}

}
