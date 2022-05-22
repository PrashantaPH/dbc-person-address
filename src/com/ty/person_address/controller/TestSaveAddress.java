package com.ty.person_address.controller;

import com.ty.person_address.dto.Address;
import com.ty.person_address.service.AddressService;

public class TestSaveAddress {

	public static void main(String[] args) {
		
		AddressService service=new AddressService();
		
		Address address=new Address();
		
		address.setId(2);
		address.setStreet("4th cross");
		address.setDoorNo("P12");
		address.setCity("Gadag");
		address.setPincode(223011);
		int res=service.saveAddress(address, 1);
		
		if(res>0)
		{
			System.out.println("Data Inserted");
		}
		else
			System.out.println("No data Inserted");
		
		
	}
}
