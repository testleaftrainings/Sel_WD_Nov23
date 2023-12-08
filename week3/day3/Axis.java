package week3.day3;

public class Axis implements RBI {

	public void openAccount(String Kyc) {
		System.out.println("Submit your KYC");
	}

	public void deposit(int max) {
		System.out.println("Reaching the max amount will be reportable");
		
	}
	public void interest() {
		System.out.println("5%");
	}
  public static void main(String[] args) {
	  Axis bank =new Axis();
	  bank.deposit(2000);
	  bank.openAccount("proof");
	  System.out.println(RBI.minAmount);
	  bank.interest();
}

public void loan() {
	
}

public void carLoan() {
	// TODO Auto-generated method stub
	
}
}
