class parent{

	int x = 10;

	static void fun(){
	
		System.out.println("In Static-Fun Method");
	
	}

	void run(){
	
		System.out.println("In Instance Run Method");
	
	}





}
class child extends parent{

																									static int x = 20;

	public static void main(String args []){
	
		System.out.println(x);

		parent obj = new parent();

		obj.run();
		parent.fun();
	
	}



}
