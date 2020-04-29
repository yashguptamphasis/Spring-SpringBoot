package com.Aop.demoAop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aop.demoAop.Dao.Dao1;

@Service
public class Bussiness1 {

	@Autowired
	Dao1 dao1;
	
	public String b1()
	{
	//	System.out.println("Bussiness B1 called");
		return dao1.retriveValue();
	}
}
