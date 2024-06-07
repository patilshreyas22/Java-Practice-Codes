class demo{

	 demo(){
		this(10);
		System.out.println("In No-arg Constructor");
	
	}

	demo(int x){
		this(10,20);
		System.out.println("In para-1 Constructor");
	
	}

	demo(int x , int y){
	
		System.out.println("In para-2 Constructor");
		int z = x+y;
		System.out.println(z);
	
	}

	public static void main(String args []){
	
	
		demo obj = new demo();
		System.out.println("In Main Method");
	
	}




}
