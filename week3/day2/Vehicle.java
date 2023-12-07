package week3.day2;

public class Vehicle {
	String brandName = "SUV";
	static String cname;

	
	static {
		System.out.println("Static block");
	}
	
	public static void applyBrakes() {
		System.out.println(cname="qeagle");
		System.out.println("From VehicleClass");
	}

	public void soundHorn() {
		System.out.println("SoundHorn from Vehicle class");
	}
public static void main(String[] args) {
	System.out.println(cname);
    applyBrakes();
}
	

}
