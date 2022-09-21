package javaPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("file.txt");
			
			PrintWriter p = new PrintWriter(new FileWriter(f),true);
			
			p.println("Hello World");
			
			p.close();
			
			f.setReadOnly();
			
			PrintWriter p1 = new PrintWriter(new FileWriter("file.txt"),true);
			
			p1.println("Hello World");
			
			p1.close();
		}
		
		catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}

	}

}
