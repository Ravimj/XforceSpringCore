package com.dev.spring.core.auto.config;


import org.springframework.stereotype.Component;

@Component("tester")
public class SoftwareTester implements Job{

	public void doWork() {
		System.out.println("Test codes n codes n codes");
	}

}
