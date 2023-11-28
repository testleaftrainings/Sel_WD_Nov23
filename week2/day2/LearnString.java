package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		//literal
		String str ="Testleaf";
		String str2 ="TestLeaf";
		//object
		String str1=new String("Testleaf");
		//compare the string value
		
      System.out.println(str.equals(str1));
      //compare the reference of the variable
      System.out.println(str==str2);
      //count of char
      int length = str.length();
      System.out.println(length);
      
      System.out.println(str.equalsIgnoreCase(str2));
      //contains
      System.out.println(str.contains("Leaf"));
      //convert my string into char[]
      //'T''e''s''t'
      char[] ch = str.toCharArray();
      System.out.println(ch);
      //need to print based on index
      System.out.println(str.charAt(4));
      //split
      String input ="1-16 of over 4,000 results$";
      String[] split = input.split(" ");
      System.out.println(split);
      for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
      System.out.println(split[3]);
      System.out.println(input.toLowerCase());
      System.out.println(input.toUpperCase());
      System.out.println(input.replace('o', 'e'));
      String replaceAll = input.replaceAll("\\d", " ");//ctrl+2+l
      System.out.println(replaceAll);
      //substring
      String substring = input.substring(5);
      
      System.out.println(input.substring(5));
      System.out.println(input.substring(12,19));
      
      
      
      
      
      
	}

}
