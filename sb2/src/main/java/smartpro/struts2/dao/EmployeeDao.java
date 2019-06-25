package smartpro.struts2.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import smartpro.struts2.model.Employee;

public interface EmployeeDao {
	public Employee getEmployee(String username) throws SQLException;
	public ArrayList queryById(String id) throws SQLException;
}
