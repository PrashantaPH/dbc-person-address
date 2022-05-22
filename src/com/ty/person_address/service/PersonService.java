package com.ty.person_address.service;

import com.ty.person_address.dao.PersonDao;
import com.ty.person_address.dto.Person;

public class PersonService {

	PersonDao dao=new PersonDao();
	
	public int savePerson(Person person)
	{
		
		return dao.savePesron(person);
	}
	
	public Person validatePerson(String name,String email)
	{
		return dao.validateUser(name, email);
	}
}
