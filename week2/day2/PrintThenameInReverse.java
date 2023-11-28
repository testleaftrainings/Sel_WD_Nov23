package week2.day2;

public class PrintThenameInReverse {

	public static void main(String[] args) {
		String input="Testleaf";//faeltseT
		//convert your string into char
		char[] ch = input.toCharArray();
		for (int i =ch.length-1; i >=0; i--) {
			System.out.println(ch[i]);//7 6 5 4  3 2 1 0
		}
		

	}

}
