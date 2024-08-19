import java.util.*;

class OptimizedApproach{

	
	static long factors(long number){
		
		long count = 2;
		
		if(number>0){
		for(long i=2 ; i<=number/2 ; i++){
			
			if(number%i==0){
				
				count++;
			
			}
		
		}
	}else{
		
		System.out.println("Invalid Number");
	
	}

	return count;

    }

    public static void main(String args []){
    	
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter a number : ");

	    long number = sc.nextInt();

	    long count = factors(number);  //this line fills the count variable with count returned by the 'factors' function

	    System.out.println("Total factors of " + number + " are " + count);
    
    
    }

}
