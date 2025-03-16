package PracticingByOwn;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = {1,2,3,1};
		
		System.out.println(containsduplicate(nums));
		
		

	}

	private static boolean containsduplicate(int[] nums) {
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		for( int num: nums) {
			if(hashset.contains(num)) {
				return true;
			}
			hashset.add(num);
		}
		return false;
				
	}
	

}
