package com.ty.person_address.controller;

import com.ty.person_address.dto.Person;
import com.ty.person_address.service.PersonService;

public class TestValidatePerson {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		
		Person person= personService.validatePerson("prashant","p@gmail.com" );
		
		if (person != null)
		{
			System.out.println(person);
		}
		else
			System.out.println("No records....!");
		
	}
}
