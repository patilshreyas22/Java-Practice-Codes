// this code is trying to depict the flow of the program
//

class demo{


	int x = 10 ; // instance variable which will be stored in the constructor inside the object
	
	static int y = 20; // static variable whcih will be stored in the static block
	
	void fun ( ) {
	
		// this is the non-static method whose address will be pushed in the constructor 
		
		System.out.println("Non-Static Method Fun");
	
	}

	static void run () {
	
	
		// this is the static method run whose address will be pushed in the static block and will be called before the main method , as the static blocks stack frame is pushed onto 			the java stack even before the main method 
		
		System.out.println("In the Static method run ");
		
	}

	demo(){
	
		// after creation of the object the constructor will be initialized , then this constructor will call the constructor of the parent of this class which is the object class
		// for now , then it will return from there back to the constructor and initialize all the instance variables inside it and also the instance methods , and then print SOP
		// from the instance block and then print the below written SOP from the constructor 

		System.out.println("In the Constructor");
		
	}
	static {
	
		System.out.println("In Static Block");
		System.out.println(y);
		// this will be excuted first as this is the static block 
	
	
	}
	{
	
		System.out.println("This is the instance Block");
		System.out.println(x);
	
	
	}

	public static void main(String args []){
	
	
		System.out.println("This is the Main Method");
		demo obj = new demo();
		demo.run();
		

		// this will be executed right after the static block
	
	}

	




}
