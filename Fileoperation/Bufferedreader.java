package Fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreader {

	public static void main(String[] args)  {
		try {
		FileReader reader=new FileReader("sample.txt");
		BufferedReader reader2=new BufferedReader(reader);
		String s=reader2.readLine();
		while(!s.equals(null))
		{
		System.out.println(s);
		s=reader2.readLine();	
		}
	}
		catch(IOException e)
		{
			System.out.println("Completed reading");
			//e.printStackTrace();
		}
	}

}
