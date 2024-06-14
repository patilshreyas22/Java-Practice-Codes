class code11{

	public static void main(String args []){
	
	
	
	int num = 9367924;
	
	int oddsum = 0;

	int evenproduct = 1;

	while( num > 0 ){
	
	
		int digit = num % 10;

		if( digit % 2 == 0){
		
		
			evenproduct = evenproduct * digit;
		
		}
		else{
		
		
			oddsum = oddsum + digit;
		
		}

		num = num / 10;
	
	
	
	}

		System.out.println("Product of even digits is " + evenproduct);
		System.out.println("Sum of odd digits is " + oddsum);
	
	
	
	
	
	
	}





}
