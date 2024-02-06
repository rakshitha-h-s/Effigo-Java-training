package java_programs;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
public static void main(String[] args) {
	TreeMap<Integer,String> s=new TreeMap();
	s.put(1, "raksh");
	s.put(3, "mansa");
	s.put(2, "elakya");
	//sorts based on key	
	//accessing key value through for each
	for(Map.Entry<Integer,String> entry:s.entrySet())
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
}
}
