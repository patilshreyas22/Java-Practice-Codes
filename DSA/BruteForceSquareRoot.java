import java.util.*;

class client{

	static int itr;
	
	static int operations(int number){

		
		
		int start=1 , end=number , ans=0;

		while(start<=end){

			itr++;
			
			int mid = (start+end)/2;

			int square = mid*mid;

			if(square==number){
				
				return mid;
			}

			if(square>number){
			
				end = mid-1;
			}else{
				
				start = mid + 1;
				ans = mid;
			
			}
			
		
		}

		return ans ;
	
	
	}

	public static void main(String args []){
		
		System.out.println(operations(36));
		
		System.out.println("No of Iterations took : " + client.itr);
	
	}


}
