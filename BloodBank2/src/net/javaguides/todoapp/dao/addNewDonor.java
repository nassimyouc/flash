package net.javaguides.todoapp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;


import net.javaguides.todoapp.model.Add;

import net.javaguides.todoapp.utils.JDBCUtils;

public class addNewDonor implements BloodDao  {
	
	private static final String INSERT_Add_SQL = "INSERT INTO donor"
			+ "  (name, father, mother, mobilenumber, gender, email, bloodgroup, address) VALUES " + " (?, ?, ?, ?, ?, ?, ?, ?);";

	private static final String SELECT_ALL_Blood = "select * from donor;";
	private static final String DELETE_Blood_BY_ID = "delete from donor where id = ?;";
	private static final String UPDATE_Blood = "update donor set name = ?, father = ?, mother =?, mobilenumber =?, gender = ?, email = ?, bloodgroup = ?, address = ? where id = ?;";

	public addNewDonor() {
	}
	
	
	public int insertBlood(Add t1) throws SQLException {
		System.out.println(INSERT_Add_SQL);
		int result = 0;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_Add_SQL)) {
			preparedStatement.setString(1, t1.getName());
			preparedStatement.setString(2, t1.getFather());
			preparedStatement.setString(3, t1.getMother());
			preparedStatement.setInt(4, t1.getMobilenumber());
			preparedStatement.setString(5, t1.getGender());
			preparedStatement.setString(6, t1.getEmail());
			preparedStatement.setString(7, t1.getBloodgroup());
			preparedStatement.setString(8, t1.getAddress());
			
			
			
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return result;
	}



	public List<Add> selectAllBlood() {
		List<Add> bloods = new ArrayList<>();

		// Step 1: Establishing a Connection
		try (Connection connection = JDBCUtils.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Blood);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				long id = rs.getLong("id");
				String name = rs.getString("name");
				String father = rs.getString("father");
				String mother = rs.getString("mother");
				int mobilenumber = rs.getInt("mobilenumber");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String bloodgroup = rs.getString("bloodgroup");
				String address = rs.getString("address");
				
				bloods.add(new Add(id, name, father, mother, mobilenumber, gender, email, bloodgroup, address));
				
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return bloods;	}

	@Override
	public boolean deleteBlood(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_Blood_BY_ID);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	

	@Override
	public boolean updateBlood(Add b1) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_Blood);) {
			statement.setString(1, b1.getName());
			statement.setString(2, b1.getFather());
			statement.setString(3, b1.getMother());
			statement.setInt(4, b1.getMobilenumber());
			statement.setString(5, b1.getGender());
			statement.setString(6, b1.getEmail());
			statement.setString(7, b1.getBloodgroup());
			statement.setString(8, b1.getAddress());
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	

	


	
}
