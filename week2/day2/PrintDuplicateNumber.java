package week2.day2;

import java.util.Arrays;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		int[] input = {11,12,11,11,13,12,14,15,1,6};
		int count=0;
		Arrays.sort(input);//1 6 11 11 11 12 12 13 14 15
		for (int i = 0; i < input.length; i++) {
			
			for (int j = i+1; j < input.length; j++) {// 8<8 j++
				
				if(input[i]==input[j]) {//1==1
				  count++;
					System.out.println(input[i]);
				}
				
			}
			
			
		}
		System.out.println(count);
	}

}
