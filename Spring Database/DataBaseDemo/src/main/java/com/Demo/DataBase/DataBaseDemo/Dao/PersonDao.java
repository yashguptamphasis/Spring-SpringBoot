package com.Demo.DataBase.DataBaseDemo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Demo.DataBase.DataBaseDemo.Bean.Person;

import javassist.bytecode.stackmap.BasicBlock.Catch;
@Repository
public class PersonDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("unchecked")
	public List<Person> findAll()
	{
		return jdbcTemplate.query
			("select * from Person",
					new BeanPropertyRowMapper(Person.class));
		
	}
	

	public Person findById(int i)
	{
		Person p=null;
		try {
			 p=jdbcTemplate.queryForObject
					("select * from person where id=?", new Object[] {i},new BeanPropertyRowMapper<Person>(Person.class) );
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("We do not have what you asked for");
		}
			return p;
	}
}



