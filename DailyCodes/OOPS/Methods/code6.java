class code6{

	static void fun(){
	
		System.out.println("In Fun");
	}

	public static void main(String args []){
	
		code6 obj = new code6();
		
		obj.fun();

		code6.fun();

		fun();
	
	}

}
