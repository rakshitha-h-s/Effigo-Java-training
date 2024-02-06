package java_programs;

public class Inheritance_example {
	public static void main(String[] args) {
		Child c = new Child("black", "small");
		c.area(5, 3.14);
		System.out.println(c.shape);
		System.out.println(c.r);
	}

}

class Parent1 {
	int r;
	String shape;

	Parent1(int r, String shape) {
		this.r = r;
		this.shape = shape;
		System.out.println("radius " + r + " shape " + shape);
	}

	final double pi = 3.14;

	void area(int r, double pi) {
		System.out.println("the area is " + pi * r * r);
	}
}

class Child extends Parent1 {
	String color = "red";
	String size = "medium";

	Child(String color, String size) {
		super(5, "oval");
		this.color = color;
		this.size = size;

	}
}