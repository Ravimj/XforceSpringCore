package com.dev.java;

public class Test 
{
	public static void main(String[] args) {
		Person p = new Person();
		p.setEmail("somthing@gmail.com");
		p.setName("Blake");
		p.setJob(new SoftwareTester());
		p.getJob().doJob();
	}
}