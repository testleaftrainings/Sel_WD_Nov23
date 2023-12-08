package week3.day3;

public class Vehicle {
	String brandName = "SUV";
	static String cname;

	public  void applyBrakes() {
		
		System.out.println("Braking system");
	}

	public void soundHorn() {
		System.out.println("SoundHorn from Vehicle class");
	}
public static void main(String[] args) {
	System.out.println(cname);
   
}

	

}
