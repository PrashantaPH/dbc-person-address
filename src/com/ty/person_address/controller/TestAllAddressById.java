package com.ty.person_address.controller;

import java.util.List;

import com.ty.person_address.dto.Address;
import com.ty.person_address.service.AddressService;

public class TestAllAddressById {

	public static void main(String[] args) {
		AddressService service = new AddressService();

		List<Address> list = service.getAddressById(1);

		if (list != null) {
			System.out.println(list);
		} else
			System.out.println("No data");
	}
}
