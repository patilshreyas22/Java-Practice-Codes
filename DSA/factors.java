import java.util.*;

class factor{
		
	static long count = 0;
	
	static long check(long number){
		
		if(number>0){
		for(long i = 1 ; i<=number ; i++){
			
			if(number%i==0){
				System.out.println(i + " is a factor of " + number);	
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

		System.out.println("Enter a number :");

		long number = sc.nextLong();

		check(number);

		System.out.println("Total factors of " + number + " : " + count);
	
	}

}
