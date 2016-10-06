package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter path ...");
		String path=br.readLine();
		
		File file=new File(path);
		
		if(file.exists()){
			System.out.println("Contents of directory are:  ");
			if(file.isDirectory()){
				System.out.println("Given path is directory.");
				
				File[] files=file.listFiles();
				
				for(File f:files){
					 System.out.println(f.getName());
					 if(f.getName().endsWith("txt"))
					 {
						 f.delete();
						 System.out.println(f.getName() +" is deleted");
					 }
				}
				
				
			}
			else if(file.isFile()){
				System.out.println("Given path is file.");
				System.out.println(file.getPath());
				System.out.println(file.getTotalSpace());
				
			}
		}
	
	
	}
}
