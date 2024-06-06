class code8{


	public static void main(String args []){
	
	
	
		int num = 125;
		int prod = 1;
		while(num > 0){
		
			int digit = num % 10;
			prod = prod * digit;

			num = num / 10; 
		
		}

		
		System.out.println("Product is " + prod);
	
	
	
	
	}






}
