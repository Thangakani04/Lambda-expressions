package PracticingByOwn;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int [] nums= {2,7,11,15};
		int target = 17;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
			if(nums[i] + nums[j] == target) {
				System.out.println(Arrays.toString(new int[] {i,j}));
			}
			}
		}

	}

}
