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

public class Entry3 {
	
	public static void main(String[] args) throws IOException, SQLException {
		
		Properties props=new Properties();
		
		FileInputStream fIn=new FileInputStream("dbDetails.properties");
		
		props.load(fIn);
		
		String url=props.getProperty("jdbc.url");
		
		Connection dbConnection = null;
		
		dbConnection=DriverManager.getConnection(url);	
		
		String selectQuery=props.getProperty("jdbc.query.select");
		
		Statement stmt=null;
		
		 try {
		        stmt = dbConnection.createStatement();
		        stmt = dbConnection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
		                   ResultSet.CONCUR_UPDATABLE);
		        ResultSet result = stmt.executeQuery(selectQuery);

		        while (result.next()) {
		           String name=result.getString("name");
		           String new_name="developer_"+name;
		           result.updateString("name",new_name);
		           result.updateRow();
		           System.out.println(result.getString(1));
		        }

		    } catch (SQLException e ) {
		       e.printStackTrace();
		    } finally {
		        if (stmt != null) { stmt.close(); }
		    }
		
		
		
		
	}

}
