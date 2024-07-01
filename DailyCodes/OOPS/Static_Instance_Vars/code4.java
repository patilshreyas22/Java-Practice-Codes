class code4{
	
	int x = 10;

	String str = new String("Ashish");

	static int y = 20;

	public static void main(String args []){
		
		int a = 30;

		int b = 30;

		String str1 = new String("Ashish"); 
  		
	 
	       code4 obj = new code4();

		System.out.println(System.identityHashCode(a));

		System.out.println(System.identityHashCode(b));
		
		System.out.println(System.identityHashCode(obj.str));
		
		
		System.out.println(System.identityHashCode(str1));
		
		

	}



}
