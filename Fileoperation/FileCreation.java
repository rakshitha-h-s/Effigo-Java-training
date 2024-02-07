package Fileoperation;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		try {
		File fileobj=new File("sample.txt");
		if(fileobj.createNewFile())
		{
			System.out.println("File created");
		}
		else {
			System.out.println("file exists");
			System.out.println(fileobj.getAbsolutePath());
		}
	}
		catch(IOException e){		
		System.out.println("error");
		e.printStackTrace();
		}
	}

}
