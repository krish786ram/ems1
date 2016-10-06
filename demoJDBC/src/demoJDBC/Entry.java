package demoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Entry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//TODO  LOAD AND REGISTER 'JDBC DRIVER'
		
		String driver="com.mysql.jdbc.Driver";
		Class.forName(driver);
		
		//TODO GET DATABASE CONNECTION USING 'JDBC URL'
		
		String url="jdbc:mysql://localhost:3306/test";
		Connection dbConnection = null;
		try{
		dbConnection=DriverManager.getConnection(url);
		
		System.out.println("Connection successful ? "+(dbConnection!=null));
		}
		
		finally{
			dbConnection.close();
		}
	}
}
