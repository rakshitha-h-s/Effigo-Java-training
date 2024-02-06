package java_programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrograms {
public static void main(String[] args)
{
	Set<Integer> s=new HashSet<Integer>();
	s.add(4);
	s.add(5);
	s.add(7);
	s.add(2);
	s.add(2);
	//duplicate elements are removed and it is not sorted.
	for(Object a:s)
	{
		System.out.println(a);
	}
	Set<Integer> s2=new TreeSet();
	s2.add(3);
	s2.add(4);
	s2.add(1);
	s2.add(4);
	//it is auto sorted and duplicate elements are removed
	for(Object s1:s2)
	{
		System.out.println(s1);
	}
	
}
}
