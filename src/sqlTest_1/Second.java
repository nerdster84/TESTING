package sqlTest_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Second {

	
	public static final int ADDRESS_POSTAL = 1;
	public static final int ADDRESS_EMAIL = 1;
	public static final int ADDRESS_URL = 1;
	
	public static void main(String[] args) {
		
		establishSQLConnection();
		
		//Tabelle anlegen
		createTable(ADDRESS_EMAIL);
		
		//Werte einspeichern
		
		//Werte abfragen
		
	}
	
	private static void createTable(int addressnr) {}
	
	private static void establishSQLConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		String mariaDBUrl = "jdbc:mysql://localhost:3306/test";
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = DriverManager.getConnection(mariaDBUrl, "root", "");
			connection.getMetaData();
			stmt = connection.createStatement();
			System.out.println(stmt.getMaxRows());
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}	
}
