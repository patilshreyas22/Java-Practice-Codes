class one{

	int x = 10;

	static int y = 20;

	void fun(){
	
		System.out.println("In Fun Method");
	}

	static void run(){
	
		System.out.println("In Run Method");
	}

}

class two{

	public static void main(String args []){
		
		System.out.println("In Main Method");

		System.out.println(x); // cannot find symbol

		System.out.println(y); // cannot find symbol
	
	}


}
