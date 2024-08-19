import java.util.*;

class factor{
		
	static int count = 0;
	
	static int check(int number){
		
		if(number>0){
		for(int i = 1 ; i<=number ; i++){
			
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

		System.out.println("Enter a number :");

		int number = sc.nextInt();

		check(number);

		System.out.println("Total factors of " + number + " : " + count);
	
	}

}
