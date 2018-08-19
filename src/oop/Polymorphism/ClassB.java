package oop.Polymorphism;

public class ClassB {

public int area(int a, int b) {
	int total = a+b;
	  return total; 
}
public int area(int b) {
	int total = b;
	  return total;
}
public int area(int a, int b, int c) {
	int total = a+b+c;
	  return total;
}
}
