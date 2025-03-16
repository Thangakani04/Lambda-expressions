package PracticingByOwn;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a ="cat";
		String b="tah";
		
		char[] arr = a.toCharArray();
		System.out.println(arr);
		
		String[] arr11 = {"A" , "B" ,"C"};
		
		char[] ar = a.toCharArray();
		
		char[] arr1 = b.toCharArray();
		System.out.println(arr1);
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		if(Arrays.equals(arr, arr1)) {
			System.out.println("Its anagram");
		}
		else {
			System.out.println("Its not anagram");
		}
		 

	}

}
