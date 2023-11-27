package week2.day1;

public class Calculation {

	public void add(int a, float b) {
		System.out.println("output"+" "+(a+b));
	}

	public  int sub(int a,int b) {
		
		int result =a-b;
		System.out.println(result);
		return result;

	}

	protected void div(int a, int b) {
		System.out.println(a / b);
	}

	void mul() {
		int sum, a = 20, b = 5;
		sum = a * b;
		//System.out.println(sum);
	}

	public static void main(String[] args) {
		//Create obj for class
		Calculation cal =new Calculation();
		cal.add(10, 20);
	cal.sub(20, 30);
		cal.mul();
		cal.div(10, 5);
	}
}
