package com.Aop.demoAop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class Aspect1 {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	
	@Pointcut("execution(* com.Aop.demoAop.service.*.*(..))")
	void common()
	{
		
	}
	
	
	
	@Before("com.Aop.demoAop.aspect.Aspect1.common()")
	public void before(JoinPoint joinPoint){
//		logger.info(" Check for user access ");
//		logger.info(" Allowed execution for {}", joinPoint);
		System.out.println("Before");
	}
	
	@AfterReturning(value="execution(* com.Aop.demoAop.Dao.*.*(..))"
			,returning="result")
	void after(JoinPoint joinpoint,Object result)
	{	
		System.out.println("After and the value is : "+result); 
		
	}

	
	@Around("execution(* com.Aop.demoAop.service.*.*(..))")
public	void around(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("Before methord call from around");
		
		joinpoint.proceed();
		
		System.out.println("After methord call from around");
	}
}
