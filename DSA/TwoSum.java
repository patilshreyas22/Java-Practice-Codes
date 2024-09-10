import java.util.*;
class Solution{
	
	public static int[] twoSum(int[] nums , int target){
		
		int counter = 1;

		

		for(int i = 0 ; i<nums.length ; i++){
			
			if(sums[i]+sums[counter]==target){
				
				return i , counter;
			}
		
		}
			
	}

	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();

		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		int nums [] = new int [size];

		for(int i = 0 ; i<size ; i++){
			
			nums[i] = sc.nextInt();
		
		}

		System.out.println("Finding out the two indices : ");

		twoSum(nums , target);
	
	
	}



}
