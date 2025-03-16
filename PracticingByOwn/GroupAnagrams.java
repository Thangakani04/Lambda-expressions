package PracticingByOwn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"tcs" ,"own","now","cts","won","can"};
		System.out.println(groupofanagram(strs));

	}

	private static List<List<String>> groupofanagram(String[] strs) {
		
		if(strs.length==0) {
			return new ArrayList();
		}
		Map<String,List> result = new HashMap<>();
		int[] count = new int[26];
		
		for(String s: strs) {
			Arrays.fill(count, 0);
			
			for(char c: s.toCharArray()) {
				
				count[c - 'a']++;
			}
			
			StringBuilder sb = new StringBuilder("");
			for(int i=0;i<26;i++) {
				sb.append("#");
				sb.append(count[i]);
			}
			String key = sb.toString();
			if(!result.containsKey(key)) {
				result.put(key, new ArrayList());
			}
			result.get(key).add(s);
		}
		
			
		
		return new ArrayList(result.values());
	}

}
