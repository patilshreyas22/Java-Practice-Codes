import java.util.*;

class OptimizedApproach{


	static long factors(long number){
		
		long count = 2;

		for(int i = 2 ; i<=Math.sqrt(number) ; i++){
			
			if(number%i==0){
				
				if(i==number/i){
					
					count +=1;
				}else{
					
					count +=2;
				}
			}
		
		}

		return count;
	
	
	}
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");

		long number = sc.nextLong();

		long count = factors(number);

		System.out.println("Total factors of " + number + " are " + count);
	
	
	}


}
