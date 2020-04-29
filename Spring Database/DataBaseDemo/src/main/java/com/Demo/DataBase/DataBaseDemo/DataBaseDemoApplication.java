package com.Demo.DataBase.DataBaseDemo;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Demo.DataBase.DataBaseDemo.Bean.Person;
import com.Demo.DataBase.DataBaseDemo.Dao.PersonDao;

@SpringBootApplication
public class DataBaseDemoApplication implements CommandLineRunner{

//	@Autowired
//	static PersonDao pd;
//	
	@Autowired
	static Person p;
	
	public static void main(String[] args) {
	
	ConfigurableApplicationContext context=	SpringApplication.run(DataBaseDemoApplication.class, args);	
	PersonDao pf= context.getBean("personDao",PersonDao.class);
	System.out.println(pf.findAll());
	
	System.out.println("Person with id : 1 is = "+pf.findById(10001));
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		List<Person> p =pd.findAll();
//		System.out.println(p.get(1));
	
	}

}
