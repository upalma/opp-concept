package oop.Abstraction;

public class DhakaUniversity extends PlayGround implements University, Moduel{

	public void Campus() {
		System.out.println("Dhaka university has a big own campus");
	}
	public void Teacher() {
		System.out.println("Dhaka university all Teacher is well educated");	
	}
	public void Student() {
		System.out.println("Dhaka university has 50 thousand students");	
	}
	public void faculty() {
		System.out.println("Dhaka university has 50 different faculty");	
	}
	
	public void Library() {
		System.out.println("Dhaka university have a big public Library");
		
	}
	
	public void indoorGame() {
		System.out.println("Dhaka university have lots of indoor game");
		
	}

}
