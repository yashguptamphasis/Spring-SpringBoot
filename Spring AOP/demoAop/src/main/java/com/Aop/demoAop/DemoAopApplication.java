package com.Aop.demoAop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Aop.demoAop.service.Bussiness1;
import com.Aop.demoAop.service.Bussiness2;

@SpringBootApplication
public class DemoAopApplication implements CommandLineRunner{

	@Autowired
	Bussiness1 b1;
	
	@Autowired
	Bussiness2 b2;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(b1.b1());
		System.out.println(b2.b2());
	}

}
