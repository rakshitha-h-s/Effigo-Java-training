package java_programs;

import java.util.HashMap;

public class Hashmap_programs {
public static void main(String[] args)
{
	HashMap<String,Integer> h=new HashMap<String,Integer>();
	h.put("raksh", 1);
	h.put("mansa",2);
	h.put("aparna",3);
	System.out.println(h.get("raksh"));
}
}
