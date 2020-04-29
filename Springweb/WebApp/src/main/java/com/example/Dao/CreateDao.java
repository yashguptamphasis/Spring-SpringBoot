package com.example.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Beans.Emp;

@Repository
public class CreateDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public int createEmp(Emp emp)
	{				
		String query="insert into emp values('"+emp.getName()+"','"+emp.getEmail()+"','"+emp.getPhone()+"','"+emp.getPassword()+"')";
		return jdbcTemplate.update(query);
	}
}
