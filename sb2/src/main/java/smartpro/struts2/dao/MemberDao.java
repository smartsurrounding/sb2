package smartpro.struts2.dao;

import java.sql.SQLException;

import smartpro.struts2.model.Member;

public interface MemberDao {
	public boolean login(String username, String password) throws SQLException;
	public String getGrade(String username) throws SQLException;

	public default boolean isManager(String grade) {
		if("M".equals(grade))
			return true;
		return false;
	}
}
