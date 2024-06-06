class code10{


	public static void main(String args []){
	
	
	
		int num = 2469185;
		int product = 1;
		int sum = 0;

		while (num > 0){
		
			int digit = num % 10;
			if(digit % 2 ==1){
			
				product = digit * digit;
			       sum += product;	
			
			}
			num = num / 10;
		
		}
		
			System.out.println(sum);
		
	
	
	
	
	
	
	}








}
