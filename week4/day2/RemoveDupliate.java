package week4.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliate {

	public static void main(String[] args) {
		String input ="Testleaf";
		//convert string to  Char
		char[] ch = input.toCharArray();
		Set<Character> dup =new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			dup.add(ch[i]);
			System.out.println(dup);
		}
		
	

	}

}
