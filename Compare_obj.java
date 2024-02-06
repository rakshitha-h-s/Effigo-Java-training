package java_programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare_obj {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList(Arrays.asList(1, 3, 5, 7, 2, 9, 4, 8, 10));
		ArrayList<String> aList1 = new ArrayList(Arrays.asList("raksh","astha","mansa","aparna"));
		aList.stream().sorted((x, y) -> x.compareTo(y)).forEach(x -> System.out.println(x));
		aList1.stream().sorted((x, y) -> x.compareTo(y)).forEach(x -> System.out.println(x));
	}
}
