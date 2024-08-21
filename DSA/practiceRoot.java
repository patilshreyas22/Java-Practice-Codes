class root{
	static int itr = 0;
	static int operations(int number){
		
		int val = 0;
		
		for(int i = 1 ; i*i<=number ; i++){ // here the iterations count will be equal to the square root of the number 
			
			itr++;

			if(i*i<=number){
				
				val = i;
			
			}
		
		}

		return val;
	
	
	}

	public static void main(String args []){
			
		System.out.println("Square root : " + operations(100));

		System.out.println("Total Iterations : " + itr);
	
	}


}
