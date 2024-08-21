import java.util.*;

class OptimizedApproach{


	static long factors(long number){
		
		long count = 2;

		long itr = 0;

		for(int i = 2 ; i<=Math.sqrt(number) ; i++){ //as we all know that pushing a method's stack is a heavy operation for jvm , as a result 
							     //instead of using the sqrt method of Math class we can write it as " i*i = number "
		//for(int i = 2 ; i*i<=number ; i++)
							     //this will make the code even more optimized and fast
							    
			itr++;				     
			
			if(number%i==0){
				
				if(i==number/i){
					
					count +=1;
				}else{
					
					count +=2;
				}
			}
		
		}

		System.out.println("Itr : " + itr);

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
