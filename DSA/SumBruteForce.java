class Sums{

	static int operations(int number){
		
		int sum = 0;
		int itr = 0;


		for(int i = 1 ; i<=number ; i++){
			
			itr++;
			
			sum += i;	

		
		}

		System.out.println("Iterations : " + itr);
		return sum;
	
	
	}

}

class client{
	
	public static void main(String args []){
		
	int number = 100;

	System.out.println(Sums.operations(number));

	
	
	
	}


}
