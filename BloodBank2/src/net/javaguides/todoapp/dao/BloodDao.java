package net.javaguides.todoapp.dao;

import java.sql.SQLException;
import java.util.List;

import net.javaguides.todoapp.model.Add;



public interface BloodDao {
	int insertBlood(Add t1) throws SQLException;
	List<Add> selectAllBlood();
	boolean deleteBlood(int id) throws SQLException;
	boolean updateBlood(Add todo) throws SQLException;
}
