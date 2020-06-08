package com.mitali.hibernatedemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect  //@Aspect - Indicates that this is an Aspect
@Configuration //@Configuration - Indicates that this file contains Spring Bean Configuration for an Aspect.
public class UserAccessAspect {

private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	//Weaving & Weaver
	@Before("execution(* com.mitali.hibernatedemo.*.*.*(..))") //point cut 
	public void before(JoinPoint joinPoint){ 
		//Advice
		logger.info(" ************** Checking the Aspect Programming in hibernate Demo ************* ");
		logger.info(" Here are the details of Join Point {}", joinPoint);
	}
	
}
