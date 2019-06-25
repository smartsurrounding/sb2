package smartpro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcPlayer {

	public static void main(String[] args) {
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
				System.out.println("connection successful!");

				stmt = conn.createStatement();
				query = "SELECT table_name FROM information_schema.tables WHERE table_schema = '" + dbname + "';";
				rs = stmt.executeQuery(query);

				List<String> tableList = new ArrayList();
				String tableName = null;
				while (rs.next()) {
					tableName = rs.getString("table_name");
					if (tableName != null) {
						System.out.println("Table name is: " + tableName);
						tableList.add(tableName);
					}
				}
				
				for (int count1=0; count1<tableList.size(); count1++) {
					System.out.println(tableList.get(count1));
				}

				stmt = conn.createStatement();
				query = "SELECT * FROM " + tableName;
				rs = stmt.executeQuery(query);
				
				rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();

				// The column count starts from 1
				for (int i = 1; i <= columnCount; i++ ) {
					  String colName = rsmd.getColumnName(i);
					  System.out.println(colName);
				}

				while (rs.next()) {
					String customerId = rs.getString("C01_customerId");

					System.out.println("\n" + customerId);

				}

				conn.close();
				query = "SELECT * FROM " + tableName;
			}

		} catch (SQLInvalidAuthorizationSpecException ex) {
			System.out.println("Access denied!");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("\n" + "connection done");
		}
	}

}
