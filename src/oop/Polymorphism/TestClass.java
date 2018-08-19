package oop.Polymorphism;

public class TestClass {

	public static void main(String[] args) {
		ClassB ba = new ClassB();
		System.out.println(ba.area(5));
		System.out.println(ba.area(10, 5));
		System.out.println(ba.area(10, 5, 15));
		
		
		ClassA ca = new ClassA();
		System.out.println(ca.area(5));
		System.out.println(ca.area(10, 5));
		System.out.println(ca.area(10, 5, 15));
	
		Retrun re = new Retrun();
		char[] b;
		//System.out.println(b);
		//System.out.println((a) + (b));
		//System.out.println(a + b + c);
	}
}

