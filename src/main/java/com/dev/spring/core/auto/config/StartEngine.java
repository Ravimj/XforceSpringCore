package com.dev.spring.core.auto.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("start")
@Primary
public class StartEngine  implements ModeOfEngine
{

	@Override
	public void engine()
	{
		System.out.println("car is started");
		
	}

}
