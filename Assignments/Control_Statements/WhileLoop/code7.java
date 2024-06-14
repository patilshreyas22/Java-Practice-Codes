class code7{


	public static void main(String args []){
	
	
	
	int num = 216985;

	while(num > 0){
	
		int digit = num % 10;
		if(num % 2 == 0){
		
			System.out.println(digit * digit * digit);
		
		}

		num = num / 10;
	
	
	}
	
	
	
	
	}












}
