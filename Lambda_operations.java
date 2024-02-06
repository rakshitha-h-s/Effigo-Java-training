package java_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Lambda_operations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(
				"Enter the choice\na.Print in Ascending order.\nb.print in Descending order\nc.print even numbers\nd.print odd number");
		char c = s.next().charAt(0);
		ArrayList<Integer> a = new ArrayList<Integer>();
		int n = s.nextInt();
		int i=0;
		while(i<n) {
			Integer b = s.nextInt();
			a.add(b);
			i++;	
		}
		switch (c) {
		case 'a':
			a.stream().sorted((x, y) -> x.compareTo(y)).forEach(x -> System.out.println(x));
			break;
		case 'b':
			a.stream().sorted((x, y) -> y.compareTo(x)).forEach(x -> System.out.println(x));
			break;
		case 'c':
			a.stream().sorted((x, y) -> x.compareTo(y)).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
			break;
		case 'd':
			a.stream().sorted((x, y) -> x.compareTo(y)).filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));
			break;
		default:
			System.exit(0);
		}

	}
}
