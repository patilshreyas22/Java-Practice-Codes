class code9{


	public static void main(String args []){
	
		int num = 256985;
		int sum = 0;
		while(num > 0){
		
			int digit = num % 10;
			if(digit % 2 == 0){
			
			
				sum += digit;
			
			}
			
			num = num / 10;

		
		
		
		}
			System.out.println(sum);
	
	
	
	}


}
