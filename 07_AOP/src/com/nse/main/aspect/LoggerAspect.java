package com.nse.main.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

	@Before("execution(public Employee.set*(..))")
	public void log() {
		System.out.println("LoggerAspect is logging");
	}
}
