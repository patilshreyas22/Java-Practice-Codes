class root{
	static int itr = 0;
	static int operations(int number){
		
		int val = 0;
		
		for(int i = 1 ; i<=number ; i++){ 
			
			itr++;

			if(i*i<=number){
				
				val = i;
			
			}else{
				
				break; 	//here whenever the square becomes bigger than the number itself , the break statement will be triggered and it will return the latest value in val
			
			}
		
		}

		return val;
	
	
	}

	public static void main(String args []){
			
		System.out.println("Square root : " + operations(100));

		System.out.println("Total Iterations : " + itr);
	
	}


}