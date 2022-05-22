package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person_address.dto.Address;
import com.ty.person_address.util.Helper;

public class AddressDao {

	public int saveAddress(Address address,int pid)
	{
		Connection connection=Helper.getConnection();
		String sql="INSERT INTO address VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, address.getId());
			preparedStatement.setString(2, address.getStreet());
			preparedStatement.setString(3, address.getDoorNo());
			preparedStatement.setString(4, address.getCity());
			preparedStatement.setInt(5, address.getPincode());
			preparedStatement.setInt(6, pid);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	public List<Address> getAddressById(int pid)
	{
		ArrayList<Address> arrayList=new ArrayList<Address>();
		
		Connection connection=Helper.getConnection();
		String sql="SELECT * FROM address WHERE pid=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, pid);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				Address address=new Address();
				address.setId(resultSet.getInt(1));
				address.setStreet(resultSet.getString(2));
				address.setDoorNo(resultSet.getString(3));
				address.setCity(resultSet.getString(4));
				address.setPincode(resultSet.getInt(5));
				arrayList.add(address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arrayList;
	}
}
