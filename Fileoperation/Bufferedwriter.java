package Fileoperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriter {
public static void main(String[] args){
	try {
	FileWriter writer = new FileWriter("sample.txt");
	BufferedWriter writer2=new BufferedWriter(writer);
	writer2.write("inputing through buffered writer");
	writer2.close();
	System.out.println("Completed");
	}
	catch(IOException e)
	{
		System.out.println("error");
		e.printStackTrace();
	}
}
}
