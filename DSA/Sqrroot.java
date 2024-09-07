
import java.util.*;
class client{

	static int operations(int number){
		
		int start = 1;
		int end = number;
		int ans = 0;
		int itr = 0;
		
		while(start<=end){
			
			itr++;

			int mid = (start+end)/2;
			int square = mid * mid;

			if(square == number){
				
				System.out.println("Iterations Performed : " + itr);
				return mid;
			}
			else if(square>number){
				
				end = mid - 1;

			}
			else{
				
				start = mid + 1;
				ans = mid;
			
			}

		
		}


		System.out.println("Total Iterations Performed : " +  itr);
		return ans;
	}


	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number : ");

		int number = sc.nextInt();
		
		System.out.println("The Square root of " + number + " is " + operations(number));





	
	}

}
