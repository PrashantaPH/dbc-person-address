package com.ty.person_address.util;

import static com.ty.person_address.util.ConnectionObject.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static  Connection getConnection()
	{
		try {
		return 	DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
