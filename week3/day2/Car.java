package week3.day2;

public class Car extends Vehicle {
	
	public void driveCar() {
		System.out.println("From Car class");
	}
     public static void main(String[] args) {
		Car obj =new Car();
		Vehicle.applyBrakes();
		obj.soundHorn();
		obj.driveCar();
		System.out.println(obj.brandName);
		System.out.println(Vehicle.cname);
	}
}
