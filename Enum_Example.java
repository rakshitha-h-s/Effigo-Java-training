package java_programs;

import java.util.Scanner;

public class Enum_Example {
public enum Directions{
	RIGHT,
	LEFT,
	UP,
	DOWN
}
public static void main(String[] args)
{
	System.out.println("enter the direction to get the opposite direction");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	Directions e=Directions.valueOf(s);
	switch(e)
	{
	case RIGHT:
		System.out.println("The direction entered is "+e+"\nit's opposite direction is "+Directions.LEFT);
		break;
	case LEFT:
		System.out.println("The direction entered is "+e+"\nit's opposite direction is "+Directions.RIGHT);
		break;
	case UP:
		System.out.println("The direction entered is"+e+"\nit's opposite direction is"+Directions.DOWN);
		break;
	case DOWN:
		System.out.println("The direction entered is"+e+"\nit's opposite direction is"+Directions.UP);
		break;
	default:
		System.out.println("The entered direction is not valid");
		
	}
	
}
}
