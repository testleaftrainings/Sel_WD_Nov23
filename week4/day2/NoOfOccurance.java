package week4.day2;

import java.util.Map;
import java.util.TreeMap;

public class NoOfOccurance {

	public static void main(String[] args) {
		int [] data = {2,3,4,2,1,4,6,5};
		Map<Integer,Integer> occurance =new TreeMap<Integer,Integer>();
		for (int i = 0; i < data.length; i++) {//1 2 2 3 4 4 5 6
			occurance.put(data[i],occurance.getOrDefault(data[i],0));
		}
         System.out.println(occurance);
	}

}
