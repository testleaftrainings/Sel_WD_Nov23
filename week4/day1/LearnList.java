package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import week1.day1.Car;

public class LearnList {

	public static void main(String[] args) {
		//Create obj for List
		List <Integer> lstName =new ArrayList<Integer>();
		lstName.add(12);
		lstName.add(11);
		lstName.add(11);
		lstName.add(10);
		lstName.add(15);
		lstName.add(15);
		//to get the length of List
		int size = lstName.size();
		System.out.println(size);
		//print the list
		System.out.println(lstName);
		//to get particular value
		System.out.println(lstName.get(4));
		//To remove the data
		System.out.println(lstName.remove(4));
		System.out.println(lstName);
		//lstName.clear();
		System.out.println(lstName);
		System.out.println(lstName.contains(11));
		System.out.println(lstName.isEmpty());
		//sort the list
		Collections.sort(lstName);
		System.out.println("Sorted List");
		System.out.println(lstName);
		Object[] array = lstName.toArray();
		System.out.println(array);
		//addAll
		List<Integer> lst1 =new ArrayList<Integer>();
		lst1.addAll(lstName);
		//lst1.add(13);
		//lst1.add(14);
		System.out.println(lst1);
		boolean removeAll = lst1.removeAll(lstName);
		System.out.println(removeAll);	
		System.out.println(lst1);
		
		for (int i = 0; i <lstName.size(); i++) {
			System.out.println(lstName.get(i));
		}
		
		
		
		
		

	}

}
