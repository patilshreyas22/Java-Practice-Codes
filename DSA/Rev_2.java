import java.util.*;

class SqrRoot{
	
	static int operations(int number){
	
		int start = 1 , end = number , ans = 0;

		while(start<=end){
			
			int mid = (start+end)/2;

			int sqr = mid * mid;

			if(sqr==number){
				
				return mid;
			}
			if(sqr>number){
				
				end = mid-1;
			}else if(sqr < number){
				
				start = mid + 1;
				
				ans = mid;
			}


		}

		return ans;
	
	}

	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		System.out.println(operations(number));
	
	}


}
