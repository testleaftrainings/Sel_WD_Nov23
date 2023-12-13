package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
	//syntax
		Set<String> learners =new LinkedHashSet<String>();
		learners.add("Anjali");
		learners.add("Sushma");
		learners.add("Valli");
		learners.add("Ramya");
		learners.add("Deepika");
		learners.add("shaheda");
		learners.add("Anjali");
		learners.add("Sushma");
		learners.add("Valli");
		//print the value in set
		System.out.println(learners );
		//to get the count of my set
		System.out.println(learners.size());
		//check the element present
		System.out.println(learners.contains("Srivas"));
		//To remove the element from set
		System.out.println(learners .remove("Valli"));
		System.out.println(learners );
		Object[] array = learners .toArray();
        System.out.println(array[2]);

        for (String output : learners ) {
			System.out.println(output);
		}
        //convert set into list
        List<String> lstName =new ArrayList<String>(learners);
        System.out.println(lstName);
        for (int i = 0; i < lstName.size(); i++) {
			System.out.println(lstName.get(i));
		}
	}

}
