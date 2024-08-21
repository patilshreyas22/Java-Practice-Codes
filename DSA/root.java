import java.util.*;

// Time Complexity : O(sqrt(N)) , N-number

class root{
	
	static long operations(long number){
		
		long start=1 , end = number , ans=0;

		while(start<=end){
			
			long mid = (start+end)/2;
			long square = mid * mid;

			if(square==number){
			
				return mid;
			}
			if(square>number){
				
				end = mid - 1;

			}else{
				start = mid + 1;
				ans = mid;
			}
		
		}

		return ans;
	
	
	}

	public static void main(String args []){
	
		System.out.println("Enter a number to find the square root : ");

		Scanner sc = new Scanner(System.in);

		long number = sc.nextLong();

		System.out.println("Root of " + number + " is " + operations(number));

	
	}


}
