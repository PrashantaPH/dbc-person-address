package com.ty.person_address.controller;

import com.ty.person_address.dto.Person;
import com.ty.person_address.service.PersonService;

public class TestSavePerson {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		
		Person person=new Person();
		person.setpid(1);
		person.setName("prashant");
		person.setEmail("p@gmail.com");
		person.setPhone("2233554477");
		
		int res=personService.savePerson(person);
		if(res>0)
		{
			System.out.println("Data inserted");
		}
		else
			System.out.println("No data inserted");
	}
}
