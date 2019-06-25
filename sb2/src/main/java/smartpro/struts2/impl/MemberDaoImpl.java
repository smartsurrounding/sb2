package smartpro.struts2.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import smartpro.jdbc.JdbcDriver;
import smartpro.struts2.dao.MemberDao;
import smartpro.struts2.model.Member;

public class MemberDaoImpl implements MemberDao {

	private static final Logger logger = Logger.getLogger(MemberDaoImpl.class);

	public MemberDaoImpl() {
	}

	@Override
	public boolean login(String username, String password) throws SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select count(1) from u831802711_demo.ERP_MEMBER where username = ? and password = ?";
			logger.debug("sql: " + sql);

			conn = JdbcDriver.getConn();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				int count = rs.getInt(1);
				logger.debug("count: " + count);

				if (count > 0) {
					return true;
				} else {
					return false;
				}
			}
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			conn.close();
			rs.close();
			pstmt.close();
		}
		return false;
	}

	@Override
	public String getGrade(String username) throws SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select grade from u831802711_demo.ERP_MEMBER where username = ?";
			logger.debug("sql: " + sql);

			conn = JdbcDriver.getConn();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				String grade = rs.getString("grade");
				logger.debug(username + "'s grade : " + grade);
				
				return grade;
			}
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			conn.close();
			rs.close();
			pstmt.close();
		}
		return null;
	}

}
