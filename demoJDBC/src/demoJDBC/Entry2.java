package demoJDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;

public class Entry2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		//TODO LOAD JDBC PROPERTIES FROM FILE SYSTEM
		Properties props=new Properties();
		
		FileInputStream fIn=new FileInputStream("dbDetails.properties");
		
		props.load(fIn);
		
	//	String driver=props.getProperty("jdbc.driver");
		
		//Class.forName(driver);
		
		String url=props.getProperty("jdbc.url");
		
		Connection dbConnection = null;
		
		dbConnection=DriverManager.getConnection(url);	
		System.out.println("Connection successful ? "+dbConnection!=null);
		
		
		/*try{
		insertStatement=dbConnection.createStatement();
		
		String insertQuery=props.getProperty("jdbc.query.insert");
		
		int rows;
		rows=insertStatement.executeUpdate(insertQuery);
		
		System.out.println(rows+" record is(are) added successfully");
		}
		finally{
			if(insertStatement!=null)
				insertStatement.close();
		}*/
		
		
		
		String insertQuery=props.getProperty("jdbc.query.insert");
		try(PreparedStatement insertStatement=(PreparedStatement) dbConnection.prepareStatement(insertQuery)){
			String msg="This is JAVA";
			insertStatement.setString(1, msg);
			insertStatement.executeUpdate();
		}
		
		
		
	}
}
