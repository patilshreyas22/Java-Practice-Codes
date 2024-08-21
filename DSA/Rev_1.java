import java.util.*;

class factors{
	
	static int operations(int number){
		
		int count = 2;

		int itr = 0;

		for(int i = 2 ; i*i<=number ; i++){
			
			itr++;

			if(number%i==0){
				
				if(i==number/i){
					count++;
				}else{
					
					count+=2;
				}
				
			}
		
		
		}
		
		System.out.println("Total Iterations : " + itr);
		return count;
		// System.out.println("Total Iterations : " + itr);  this will throw an error of UNREACHABLE STATEMENTS
	
	}

	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		System.out.println(operations(number));
	
	}


}
