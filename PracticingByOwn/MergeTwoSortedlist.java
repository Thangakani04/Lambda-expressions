package PracticingByOwn;

import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoSortedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(4);
		
		list1.addAll(list2);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
	}

}
