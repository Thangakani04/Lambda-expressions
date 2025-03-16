package PracticingByOwn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKelements {

	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 2, 2, 3};
		int k=2;
		int [] result = tokfrequent(nums,k);
		 System.out.println(Arrays.toString(result));

	}

	private static int[] tokfrequent(int[] nums, int k) {
		
		if(k==nums.length) {
			return nums;
		}
		Map<Integer,Integer> count = new HashMap<>();
		for(int n : nums) {
			count.put(n, count.getOrDefault(n, 0)+1);
		}
		Queue<Integer> heap = new PriorityQueue<>(
				(a,b) -> count.get(a)-count.get(b));
		
		for(int n: count.keySet()) {
			heap.add(n);
			if(heap.size() > k) {
				heap.poll();
			}
		}
		int[] answer = new int[k];
		for(int i=0;i<k;i++) {
			answer[i] = heap.poll();
		}
		return answer;
		
		
	}

}
