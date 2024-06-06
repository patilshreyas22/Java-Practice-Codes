class code5{

	public static void main(String args []){
	
	
	long number = 436780521l;

	while(number > 0){
	
		long digit = number % 10;

		if(digit % 2 == 0 || digit % 3 == 0){
		
			if(digit != 0){
			
				System.out.println(digit);
			
			}
		
		
		}


		number = number / 10;
	
	
	
	
	
	}
	
	
	
	
	
	
	
	}




}
