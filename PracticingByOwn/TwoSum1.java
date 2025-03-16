package PracticingByOwn;

import java.util.Arrays;

public class TwoSum1 {

	public static void main(String[] args) {
		
		
		
		
		 int [] nums = {2,11,7,15 };
		int target = 9;
		
	int[] result = 	twosumproblem(nums,target);
		
		System.out.println(Arrays.toString(result));
		
		
	}

	private static int[] twosumproblem(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			{
				for(int j=i+1;j<nums.length;j++) {
					
					if(nums[i]+ nums[j] == target) {
						return new int[]{nums[i],nums[j]};
						
					}
				}
			}
		}
	return new int[]{};
	}

}
