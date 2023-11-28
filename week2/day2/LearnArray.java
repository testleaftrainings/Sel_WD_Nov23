package week2.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//Using Instantiation
         int [] nums= new int[5];
         String[] name= new String[10];
         nums[0]=11;
         nums[1]=13;
         nums[2]=12;
         nums[3]=14;
         nums[4]=10;
         //nums[5]=15;
         System.out.println(nums.length);
         System.out.println(nums[4]);
         //using literal
         String[] companyName= {"Testleaf","Qeagle","Cts","Hp"};
         System.out.println(companyName[2]);//based on index
        //to get the size of Array
         int len = companyName.length;  //assign the local variable ctrl+2+l 
         System.out.println(len);//print the Array size     
         System.out.println(companyName.length);
       
         //Arrange the data in order
         Arrays.sort(companyName);
        
         //print 
        for (int i = 0; i <companyName.length; i++) {
			System.out.println(companyName[i]);
		}

	}

}
