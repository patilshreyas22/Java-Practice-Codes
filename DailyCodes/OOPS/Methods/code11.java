class one{

	int x = 10;

	static int y = 20;

	void run(){
		System.out.println("In Run Method");
	}

	static void fun(){
		System.out.println("In Fun Method");
	}



}

class two{

	



	public static void main(String args []){
	
		System.out.println("In Main");
	
		System.out.println(x);
	
		System.out.println(y);

		fun();

		run();

	}

}
