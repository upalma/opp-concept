package oop.Encapsulation;

public class TestBankAcc {

	public static void main(String[] args) {
		BankAcc bac = new BankAcc();
		bac.setName("Uzzal");
		bac.setBalance("$1500.00");
		bac.setAcNo(99);
System.out.println(bac.getName()+" "+ bac.getBalance()+" " + bac.getAcNo());
	}

}
