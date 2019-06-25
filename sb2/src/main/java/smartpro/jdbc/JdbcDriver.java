package smartpro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class JdbcDriver {

	private static final Logger logger = Logger.getLogger(JdbcDriver.class);

	private static Connection conn = null;
	
	public static Connection getConn() {
//		Connection conn = null;
		try {
			String dbname = "u831802711_demo";
			String username = "u831802711_demo";
			String password = "demo00";
			String dburl = "jdbc:mariadb://sql223.main-hosting.eu:3306/" + dbname;

            Class.forName("org.mariadb.jdbc.Driver");
            
			conn = DriverManager.getConnection(dburl, username, password);
			if (conn != null) {
				logger.debug("connection successful!");
			}

		} catch (SQLInvalidAuthorizationSpecException e) {
			logger.error("Access denied!");
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
		}

		logger.debug("return conn now");
		return conn;
	}
	
	public static void connClose(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;
		String query = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try {
			String dbname = "u367669158_login";
			String username = "u367669158_login";
			String password = "logout123";
			String dburl = "jdbc:mariadb://sql143.main-hosting.eu:3306/" + dbname;

			conn = DriverManager.getConnection(dburl, username, password);
			if (conn != null) {
				logger.error("connection successful!");

				stmt = conn.createStatement();
				query = "SELECT table_name FROM information_schema.tables WHERE table_schema = '" + dbname + "';";
				rs = stmt.executeQuery(query);

				stmt = conn.createStatement();
				query = "SELECT * FROM ERP_EMPLOYEE";
				rs = stmt.executeQuery(query);

				rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();

				// The column count starts from 1
				for (int i = 1; i <= columnCount; i++) {
					String colName = rsmd.getColumnName(i);
					logger.error(colName);
				}

				while (rs.next()) {
					String customerId = rs.getString("C01_customerId");

					logger.error("\n" + customerId);

				}

				conn.close();
//				query = "SELECT * FROM " + tableName;
			}

		} catch (SQLInvalidAuthorizationSpecException ex) {
			logger.error("Access denied!");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			logger.error("\n" + "connection done");
		}
	}

}
