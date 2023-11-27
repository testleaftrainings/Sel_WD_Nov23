package week2.day1;

public class LearnJumpStatement {

	public static void main(String[] args) {
	//break terminate from the loop immediately
		for (int i = 0; i<10; i++) {
			if(i==3) {		
				//break;
				continue;//skip the specific execution
			}
			System.out.println(i);
			
		}

	}

}
