package demo_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) throws IOException {
		
	
		Socket sock=new Socket("10.102.49.137",3249);
		
		Scanner sc=new Scanner(System.in);
		
		PrintWriter pw=new PrintWriter(sock.getOutputStream(),true);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
		
		String message="";
		
		System.out.println("Client started");
		
		while(true){
			pw.println(sc.nextLine());
			pw.flush();
			message=br.readLine();
				System.out.println("Server: "+message);
		}
	}
}
