package smartpro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import smartpro.struts2.interceptor.MyLoggingInterceptor;

public class JdbcSelect {
	/* Log4j */
	private static final Logger LOGGER = Logger.getLogger(JdbcSelect.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;
		String query = null;
		ResultSet rs = null;

		try {
			String dbname = "u367669158_login";
			String username = "u367669158_login";
			String password = "logout123";
			String dburl = "jdbc:mariadb://sql143.main-hosting.eu:3306/" + dbname;

			conn = DriverManager.getConnection(dburl, username, password);
			conn.setAutoCommit(false);
			
			if (conn != null) {
				System.out.println("connection successful!");

				stmt = conn.createStatement();
				query = "SELECT id, region, description, url"
						+ " FROM u367669158_login.TRAFFIC_CAMERA_LOCATIONS";
				rs = stmt.executeQuery(query);

				while (rs.next()) {
					String id = rs.getString("id");
					String region = rs.getString("region");					

					/*
					 * System.out.println( "Customerid: " + customerId + "\t" + "Age: " + age + "\t"
					 * + "Region: " + region + "\t" + "Remarks: " + remarks + "\t" );
					 */
					
				}

				conn.commit();
				System.out.println("connection commit!");
				conn.close();
				System.out.println("connection close!");
			}
		} catch (SQLInvalidAuthorizationSpecException ex) {
			System.out.println("Access denied!");
			ex.printStackTrace();
		} catch (SQLSyntaxErrorException ex) {
			System.out.println("SQL Syntax Error!");
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("connection done.");
		}
	}

}
