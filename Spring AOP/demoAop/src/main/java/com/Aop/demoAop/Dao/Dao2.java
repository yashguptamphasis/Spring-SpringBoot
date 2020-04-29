package com.Aop.demoAop.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
		
	public String retriveValue()
	{
		//System.out.println("dao called");
		return "Dao2";
	}
}
