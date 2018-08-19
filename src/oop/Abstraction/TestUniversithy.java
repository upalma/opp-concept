package oop.Abstraction;

public class TestUniversithy {

	public static void main(String[] args) {
		
		University ou = new OpenUniversity();
		ou.Campus();
		ou.Teacher();
		ou.Teacher();
		ou.faculty();
	
		
		University uvi = new DhakaUniversity();
		uvi.Campus();
		uvi.Teacher();
		uvi.Student();
		uvi.faculty();
		

		DhakaUniversity du = new DhakaUniversity();
		du.Campus();
		du.Teacher();
		du.Student();
		du.faculty();
		du.Library();
		du.Soccer();
		du.indoorGame();
	}

}
