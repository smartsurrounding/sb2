package smartpro.struts2.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import smartpro.jdbc.JdbcDriver;
import smartpro.struts2.dao.EmployeeDao;
import smartpro.struts2.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger logger = Logger.getLogger(EmployeeDaoImpl.class);

	public EmployeeDaoImpl() {
	}

	@Override
	public ArrayList queryById(String id) throws SQLException {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from ERP_EMPLOYEE where id like ?";

		ArrayList employees = new ArrayList();
		
		try {
			conn = JdbcDriver.getConn();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();
			if (rs.next()) {
//				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				String addr = rs.getString("addr");
				String dept = rs.getString("dept");
				String grade = rs.getString("grade");
				String title = rs.getString("title");

				Employee employee = new Employee();
				employee.setId(Integer.valueOf(id));
				employee.setName(name);
				employee.setAge(age);
				employee.setGender(gender);
				employee.setAddr(addr);
				employee.setEmail(email);
				employee.setMobile(mobile);
				employee.setDept(dept);
				employee.setGrade(grade);
				employee.setTitle(title);

				employees.add(employee);
			}
			return employees;
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
		} finally {
			conn.close();
			rs.close();
			pstmt.close();
		}
		return null;
	}

	@Override
	public Employee getEmployee(String username) throws SQLException {
		return null;
	}

}
