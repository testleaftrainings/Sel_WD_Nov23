package week4.day2;

public class Car extends Vehicle {
	String brakeSystem = "ABS";

	public void brakeType() {
		System.out.println("Vehicle:" + super.brakeSystem);
		System.out.println("Car Brake:" + brakeSystem);

	}//method level
	public void brandName() {
		
		   super.brandName();
		   System.out.println("Audi");
	   }

	public static void main(String[] args) {
		Car obj = new Car();
		
		obj.brakeType();
		obj.brandName();

	}
}
