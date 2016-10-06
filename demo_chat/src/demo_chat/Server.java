package demo_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(3222);
		Socket sock=server.accept();
		
		Scanner sc=new Scanner(System.in);
		
		PrintWriter pw=new PrintWriter(sock.getOutputStream(),true);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
		
		String message="";
		
		System.out.println("Server Started");
		
		while(true){
			message=br.readLine();
				System.out.println("Client: "+message);
			
			pw.println(sc.nextLine());
			pw.flush();
		}
		
		
	}

}
