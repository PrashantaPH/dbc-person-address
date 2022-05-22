package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.person_address.dto.Person;
import com.ty.person_address.util.Helper;

public class PersonDao {

	public int savePesron(Person person) {

		Connection connection = Helper.getConnection();
		String sql = "INSERT INTO person VALUES(?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, person.getpid());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3, person.getEmail());
			preparedStatement.setString(4, person.getPhone());

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public Person validateUser(String name, String email) {
		String sql = "SELECT * FROM  person WHERE name=? and email=?";
		Connection connection = Helper.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				Person person = new Person();
				person.setpid(resultSet.getInt(1));
				person.setName(resultSet.getString(2));
				person.setEmail(resultSet.getString(3));
				person.setPhone(resultSet.getString(4));
				return person;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
