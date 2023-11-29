package week2.day3;

public class PrintCountOfCharacter {

	public static void main(String[] args) {
		String input = "Testleaf";
		int count = 0;
		//output e=2;
		//convert string into char[]
		
		char[] ch = input.toCharArray();//'T''e''s''t'
		//int len = ch.length;
		//loop
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='e') {
				count++;
			}
			
		}
		
		System.out.println("The count of e is:"+count);
		

	}

}
