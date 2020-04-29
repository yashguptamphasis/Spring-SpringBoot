package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Beans.Emp;
import com.example.Dao.CreateDao;

@Controller
@ComponentScan(value="com.example.Dao")
public class CreateController {

	@Autowired
	CreateDao createDao;
	
	@RequestMapping(value="create")
	public String create()
	{
		System.out.println("Calling create page");
		return "/views/Create.jsp";
	}
	
	@RequestMapping(value="createSubmit")
	public String createSubmit(Emp emp, ModelMap model)
	{
		System.out.println("Create values submitted storing and callin login back");
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());	
		System.out.println(emp.getPassword());
		
		model.putIfAbsent("login","Your account is created Login now");
		int i=createDao.createEmp(emp);
		if(i==1)
		{
			System.out.println("Possitive query: create Query ");
		}
		else if(i==0)
		{
			System.out.println("Negative query: create Query ");
		}	
		
		
		return "/views/Login.jsp";
	}
	
}