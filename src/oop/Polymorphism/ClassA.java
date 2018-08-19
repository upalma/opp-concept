package oop.Polymorphism;

public class ClassA {
	
	public int area(int a, int b) {
		int total = a+b-2;
		  return total; 
	}
	public int area(int b) {
		int total = b;
		  return total;
	}
	public int area(int a, int b, int c) {
		int total = a+b+c-2;
		  return total;
	}
}
