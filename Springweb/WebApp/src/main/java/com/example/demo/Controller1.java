package com.example.demo;

import org.hibernate.validator.internal.metadata.facets.Validatable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Beans.Emp;
import com.example.service.Validate;

@Controller
@ComponentScan(value="com.example.service")
public class Controller1 {
	
	
	@Autowired
	Validate v;
	
	@RequestMapping("/")
	public String add()
	{
		System.out.println("Reached here the 1st controller returning login page");
		return "/views/Login.jsp";
	}
	

	
	
	@RequestMapping(value="/login")
	String loginPost(@RequestParam String name,
			@RequestParam String password,Emp emp,ModelMap model)
	{
		
		System.out.println("Login done :  "+emp.getName());
		if(v.validate(name, password))
		{
			model.put("name", name);
			System.out.println("Validation done calling welocme jsp  "+name);
			return "/views/welcome.jsp";
		}
		else
		{
			System.out.println("Validation failed calling login jsp");
			model.put("Error", "Wrong Id password");
			return "/views/Login.jsp";
		}
	}
	
	
}
