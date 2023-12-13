package week4.day2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		Map<Integer,String> empDetail =new HashMap<Integer,String>();
		empDetail.put(1001, "Ramya");
		empDetail.put(1002, "Deepika");
		empDetail.put(1003, "shakthi");
		empDetail.put(1003, "Samual");
		empDetail.put(1004, "Srinivas");
		empDetail.put(1005, "Valli");
         //print the map
		System.out.println(empDetail);
		//print a particular key
		System.out.println(empDetail.get(1002));
		//to check the element present
		System.out.println(empDetail.containsKey(1002));
		System.out.println(empDetail.containsValue("shakthi"));
		//check my map is empty
		boolean empty = empDetail.isEmpty();
		System.out.println(empty);
		System.out.println(empDetail.remove(1003,"Samual"));
		 //print the map
		System.out.println(empDetail);
		System.out.println(empDetail.getOrDefault(1002, "Princila"));
		//keySet
		Set<Integer> keySet = empDetail.keySet();
		System.out.println(keySet);
		System.out.println(keySet);
		//value
		Collection<String> values = empDetail.values();
		System.out.println(empDetail.values());
		//for each
		for (Integer output : empDetail.keySet()) {
			System.out.println(output);
		}
		Set<Entry<Integer, String>> entrySet = empDetail.entrySet();
		for (Entry<Integer,String> map : empDetail.entrySet()) {
			System.out.println("Key="+map.getKey());
		}
		
		
		
	}

}
