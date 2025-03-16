package PracticingByOwn;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,1,2};
		
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i =0;i< arr.length;i++) {
			hash.add(arr[i]);
		}
		
		//int [] res = new int [hash.size()];
		//hash.toArray();
		
		
		
		System.out.println(hash);
		

	}

}
