package smartpro.struts2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import smartpro.struts2.dao.MemberDao;
import smartpro.struts2.impl.MemberDaoImpl;

public class LoginAction extends ActionSupport implements SessionAware {
	private Map session;

	private String username;
	private String password;

	/* Log4j */
	private static final Logger logger = Logger.getLogger(LoginAction.class);

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String execute() {
//		logger.debug("username: " +  username);
//		logger.debug("password: " +  password);
		MemberDao memberDao = new MemberDaoImpl();
		try {
			if (memberDao.login(username, password)) {
				String grade = memberDao.getGrade(username);
				this.session.put("username", username);
				this.session.put("grade", grade);
				this.session.put("login", "Y");
				return "success";
			} else {
				this.session.put("username", username);
				this.session.put("login", "N");
				return "error";
			}
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
		}
		return "error";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
