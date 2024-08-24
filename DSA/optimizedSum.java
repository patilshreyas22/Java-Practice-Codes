class client{

	
	static int operations(int number){
	
		
		int sum = (number * (number + 1))/2;
		return sum;
	
	}

	public static void main(String args []){
		
		int number = 100;
		System.out.println(operations(number));
	
	}

}
