package com.ty.person_address.service;

import java.util.List;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;

public class AddressService {

	AddressDao save=new AddressDao();
	
	public int saveAddress(Address address,int pid)
	{
		return save.saveAddress(address,pid);
	}
	
	public List<Address> getAddressById(int pid)
	{
		return save.getAddressById(pid);
	}
}
