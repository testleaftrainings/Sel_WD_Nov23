package week3.day3;

public abstract class SBIBank  implements RBI  {

	public void carLoan() {
		// TODO Auto-generated method stub
		
	}
	//implemented method
	public void requestchequebook() {
		System.out.println("requestchequebook");
	}
	public void debitCard() {
		System.out.println("debitCard");
	}
	//unimplemented
	public abstract void checkbalance();
	
}

