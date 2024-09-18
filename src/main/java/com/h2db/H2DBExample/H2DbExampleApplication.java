package com.h2db.H2DBExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.h2db.H2DBExample.Repositories.UserRepo;

@SpringBootApplication
public class H2DbExampleApplication {

	
	
	@Autowired
	private UserRepo userrepo2;
	public static void main(String[] args) {
		SpringApplication.run(H2DbExampleApplication.class, args);
		System.out.println("hello h2 db example i am coming to conquer you");
		 H2DbExampleApplication h2 = new  H2DbExampleApplication ();
		 
	}

	
}
