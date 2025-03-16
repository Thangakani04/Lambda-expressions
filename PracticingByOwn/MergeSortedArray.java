package PracticingByOwn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
	
public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m,n =3;
		
		List<Integer> res = new ArrayList<Integer>();
		
		for(int i=0;i<nums1.length;i++) {
			if(nums1[i] != 0) {
		res.add(nums1[i]);
			}
		}
		
		for(int i=0;i<nums2.length;i++) {
			
			res.add(nums2[i]);
		}
		Collections.sort(res);
		
		System.out.println(res);

	}

}
