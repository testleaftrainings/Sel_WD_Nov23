package week3.day3;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a + b);

	}

	public void add(int a, float b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void div(int a, double b) {
		System.out.println(a / b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator cal =new Calculator();
		cal.add(10, 0.2f);
		cal.add(10, 20);
		cal.add(10, 20, 30);
		cal.div(20, 2);
		cal.div(20, 5);
	}

}
