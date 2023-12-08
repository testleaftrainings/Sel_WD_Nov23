package week3.day3;

public class BMW extends Car {

	public void applyBrakes() {

		System.out.println("Abs Braking system");
	}

	public static void main(String[] args) {
       BMW obj =new BMW();
       obj.applyBrakes();
       
	}
}
