class code3{
	
	int x = 10;

	String str = new String("Ashish");

	static int y = 20;

	public static void main(String args []){
		
		int a = 30;

		int b = 30;

		String str1 = new String("Ashish"); 
  
	       code3 obj = new code3();

		System.out.println(obj.x);

		System.out.println(obj.str);

		System.out.println(y);

		System.out.println(obj.y);

		System.out.println(a);

		System.out.println(b);
		
		System.out.println(str1); // if i call any local variables (a , b , str1) using the objects reference (obj) then it will throw a error , as local variables scope is only upto the method and cannot be referenced using the object

	}



}
