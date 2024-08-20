class client{
	
	static long addNums(long num){
		
		long sum = ((num + 1)*num)/2; //gauss theorem
		return sum;
	
	}

	public static void main(String args []){
		
		System.out.println(addNums(10));
	
	}


}
