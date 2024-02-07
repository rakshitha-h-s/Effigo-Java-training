package Fileoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args)  {
		try {
		FileReader reader=new FileReader("sample.txt");
		Scanner s=new Scanner(reader);
		while(s.hasNextLine())
		{
			String data=s.nextLine();
			System.out.println(data);
		}
		s.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("error occured");
			e.printStackTrace();
		}
		finally {
			File fobj=new File("sample.txt");
			System.out.println(fobj.getName());
			System.out.println(fobj.length());
		}
		
	}

}
