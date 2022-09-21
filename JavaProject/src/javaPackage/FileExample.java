package javaPackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		
		String str ="hello this is file handling in java";
		
		FileWriter fwrt = new FileWriter("D:\\newText.txt");
		
		for(int i =0; i <str.length();i++)
		
		{
			fwrt.write(str.charAt(i));
		}
		fwrt.close();

	}

}
