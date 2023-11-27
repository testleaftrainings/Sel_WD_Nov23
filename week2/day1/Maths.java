package week2.day1;

public class Maths {
	
	public void moduls() {
		int a = 10,b=20;
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		//Creating obj
		Calculation obj =new Calculation();
		obj.add(20, 2.0f);
		obj.div(3, 10);
		obj.mul();
		obj.sub(30, 10);
		Maths math =new Maths ();
		math.moduls();
		
	}

}
