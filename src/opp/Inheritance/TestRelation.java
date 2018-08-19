package opp.Inheritance;

public class TestRelation {

	public static void main(String[] args) {
		GFatherA gf = new GFatherA();
		gf.gfA();
		gf.frC();
	
		SonB son = new SonB();
		son.gfA();
		son.snB();
		son.frC();
		
		gSonD gs = new gSonD();
		gs.soD();
		gs.frC();
		
		gDaughter  gd = new gDaughter();
		gd.gdE();
		gd.frC();
		
	}

}
