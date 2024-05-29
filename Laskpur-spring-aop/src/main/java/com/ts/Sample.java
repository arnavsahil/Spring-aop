package com.ts;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Sample {
	
	@Before("execution(public void tchMethod())")
	public void start() {
		System.out.println("Start");
	}
	@After("execution(public void tchMethod())")
	public void end() {
		System.out.println("End");
	}
	
}
