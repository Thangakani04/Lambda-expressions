package PracticingByOwn;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,5,4};
		boolean flag=false;
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i] == nums[j]) {
					System.out.println("true");
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("false");
		}

	}

}
