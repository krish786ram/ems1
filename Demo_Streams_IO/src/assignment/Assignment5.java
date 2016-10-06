package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Assignment5 {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);		
		
		FileWriter fw=new FileWriter("sak");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		PrintWriter pw=new PrintWriter(bw);
		
		String str;
		
		System.out.println("Write in file...");
		
		str=br.readLine();
		String new_String="";
		
		while(!str.equals("END")){
			
			new_String="";
			
			for(int i=0;i<str.length();i++){
				if(Character.isUpperCase(str.charAt(i)))
					new_String+=Character.toLowerCase(str.charAt(i));
				
				else if(Character.isLowerCase(str.charAt(i)))
					new_String+=Character.toUpperCase(str.charAt(i));
				
				else if(Character.isDigit(str.charAt(i)))
					new_String+="*";
				
				else
					new_String+=str.charAt(i);
		}
			pw.write(new_String);
			pw.write("\n");
			
			
			str=br.readLine();
	}
		
		pw.flush();
		pw.close();
		bw.close();
		fw.close();
	
	}
}

