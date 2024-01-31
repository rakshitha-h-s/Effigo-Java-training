package java_programs;

import java.util.Scanner;

public class Mathematical_operations {
	public static void main(String[] args)
	{
		System.out.println("Enter the choice: \n 1.Maximum of two numbers \n 2.Minimum of two numbers 3.squareroot of a number \n 4.round off value of a number \n 5.cuberoot of a number \n 6.floor value");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter two values to compare");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("The maximum value is "+Math.max(a, b));
			break;
		case 2:
			System.out.println("enter two values to compare ");
			int c=sc.nextInt();
			int d=sc.nextInt();
			System.out.println("The minimum value is"+Math.min(c, d));
			break;
		case 3:
			System.out.println("enter the number for which the squareroot has to be found ");
			double e=sc.nextDouble();
			System.out.println("the squareroot value is"+Math.sqrt(e));
			break;
		case 4:
			System.out.println("enter the value for which the rounded value should return");
			double f=sc.nextDouble();
			System.out.println("the rounded off value is "+Math.round(f));
			break;
		case 5:
			System.out.println("enter the number for which the cuberoot has to be found");
			double g=sc.nextDouble();
			System.out.println("the cuberoot value is "+Math.cbrt(g));
			break;
		case 6:
			System.out.println("enter the value for which the floor value should return");
			double h=sc.nextDouble();
			System.out.println("the floor off value is "+Math.floor(h));
			break;
		default:
			System.out.println("Enter the value between 1-6");
			System.exit(0);
		}
	}


}
