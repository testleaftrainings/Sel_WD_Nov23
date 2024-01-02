package week7.day1;

public class ConstructorChaining {

	public ConstructorChaining(int empId) {
		this(1105,"Princila",true);
		System.out.println("One Parameter constructor");
	}
	public ConstructorChaining(int empId,String empName) {
		this(1105);
		System.out.println("Two Parameter constructor");
	}
	public ConstructorChaining(int empId,String empName,boolean isWorking) {
		
		System.out.println("Three Parameter constructor");
	}
	public ConstructorChaining() {
		this(1105,"Princila");
		System.out.println("No arg constructor");
	}
	
	public static void main(String[] args) {
		ConstructorChaining obj =new ConstructorChaining();
		

	}

}
