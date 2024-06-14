class code6{

	public static void main(String args []){
	
	
		int num = 256985;

		while(num > 0){
		
			int digit = num % 10;
			
			if(digit % 2 == 1){
			
				System.out.println(digit*digit);
			
			}

			num = num / 10;
		
		
		}
	
	
	
	
	
	}





}
