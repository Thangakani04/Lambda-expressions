package PracticingByOwn;

import java.util.HashSet;

public class DuplicateElementsArrayusingHashSet {

	public static void main(String[] args) {
		
		int nums[] = {1,8,5,7,4};
		boolean output = duplicatefind(nums);
		System.out.println(output);

	}

	private static  boolean duplicatefind(int[] nums) {
		
		HashSet<Integer> set = new HashSet();
		
		for(int num :nums) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		
		return false;
		
		
	}

}
