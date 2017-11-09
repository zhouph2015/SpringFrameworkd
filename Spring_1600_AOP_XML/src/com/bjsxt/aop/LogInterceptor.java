package com.bjsxt.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class LogInterceptor {
	
	//@Pointcut("execution( public * com.bjsxt.dao..*.*(..))")
	public void myMethod(){};
	
	//@Before("myMethod()")
	public void beforeMethod(){
		System.out.println("method started");
	}
	
	//@After("execution( public * com.bjsxt.dao..*.*(..))")
	public void AfterMethod(){
		System.out.println("method executed finished");
	}
	
	//@AfterThrowing("execution( public * com.bjsxt.dao..*.*(..))")
	public void AfterThrow(){
		System.out.println("a exception is caught");
	}
	
	

}
