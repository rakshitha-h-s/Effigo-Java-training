package java_programs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsList {

	public static void main(String[] args) {
		//ArrayList
		List<Integer> a=new ArrayList<Integer>();
		//adding elements to list
		a.add(2);
		a.add(3);
		a.add(5);
		//accessing elements through get method by passing index
		System.out.println(a.get(1));
		//accessing each obj through forEach loop
		for(Object d:a)
		{
			System.out.println(d);
		}
		//LinkedList
		List<String> b=new LinkedList<String>();
		b.add("hello");
		b.add("hi");
		b.add("good morning");
		
		// accessing elements through get method
		System.out.println(b.get(1));
		//accessing each obj through forEach loop
		for(Object d:b)
	    {
			System.out.println(d);
		}
		

	}

}
