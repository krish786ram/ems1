import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.sun.corba.se.pept.transport.Connection;

public class Entry2 {

	public static void main(String[] args) throws IOException 
	{
		int port=89;
		
		ServerSocket server=new ServerSocket(port);
		
		System.out.println("waiting for connection...");

		Socket clientInfo=server.accept();
		System.out.println(clientInfo);
		
		InputStream in=clientInfo.getInputStream();
		
	    InputStreamReader bridge=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(bridge);
		PrintWriter pw=  new PrintWriter(clientInfo.getOutputStream());
		pw.println("Hello, world");
		pw.flush();
		while(true){
			
			String line=br.readLine();
		      
			if(line.equals(""))
				break;
			
			System.out.println(line);
		      
		}
		
		
		pw.close();
		clientInfo.close();
	//	server.close();

	}

}
