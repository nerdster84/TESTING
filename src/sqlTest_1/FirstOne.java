package sqlTest_1;

import java.sql.*;
import java.lang.ArithmeticException;





public class FirstOne {
		
	
	public static void main(String[] args) {
		
		
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
			System.out.println("Driver: ");
			String mariaDBUrl = "jdbc:mysql://localhost:3306/didetry1";
			Connection connection = null;
			Statement stmt = null;
			try {
				connection = DriverManager.getConnection(mariaDBUrl, "root", "");
				connection.getMetaData();
				stmt = connection.createStatement();
				stmt.getMaxRows();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		
		try {	
			//stmt.executeUpdate("CREATE TABLE b (id int not null primary key, value varchar(20))");
			//System.out.println("Das Erstellen der Tabelle hat funktioniert :)");
			Statement stmt2 = connection.createStatement();
			Object answer = stmt2.executeQuery("show databases;");
			Class classOfAnswer = answer.getClass();
			System.out.println(classOfAnswer.toString());
			System.out.println(answer.toString());
			//stmt.close();
			stmt2.close();
			connection.close();
			
			
		
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception abgefangen, hat also nicht geklappt mit dem Code.");
		}
		finally {}
		}

}


//========================
//Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "username", "password");
//Statement stmt = connection.createStatement();
//stmt.executeUpdate("CREATE TABLE a (id int not null primary key, value varchar(20))");
//stmt.close();
//connection.close();