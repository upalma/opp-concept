package oop.Polymorphism;

public class Retrun {
	int a = 5;
	int b = 10;
	int c = 15;
	
	public int area(int a, int b) {
		this.a = a;
		this.b = b;
		int total = a+b;
		  return total;
	}
	public int area(int b) {
		this.b = b;
		int total =b;
		  return total;
	}
	
	public int area(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		  int total = a+b+c;
		  return total;
	}

}
