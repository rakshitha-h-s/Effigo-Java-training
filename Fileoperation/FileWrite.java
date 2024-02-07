package Fileoperation;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
public static void main(String[] args) throws IOException {
	try {
	FileWriter writer=new FileWriter("sample.txt");
	writer.write("hello world");
	writer.close();
	System.out.println("contents placed into the file");
}
	catch(IOException e) {
		System.out.println("error occured");
		e.printStackTrace();
	}
}
}
