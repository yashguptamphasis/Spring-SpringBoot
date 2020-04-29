package com.Aop.demoAop.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.Aop.demoAop.Dao.Dao2;

@Service
public class Bussiness2 {

	@Autowired
	Dao2 dao2;
	
	public String b2()
	{
		//System.out.println("Bussiness b2 called");
		return dao2.retriveValue();
	}
}
