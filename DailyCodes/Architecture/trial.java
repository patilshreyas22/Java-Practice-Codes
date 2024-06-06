class class1{
	public static void main(String args []){
	
		System.out.println(" finally class 1 is working");
		class2.main(args);
		System.out.println(args[0]);
		System.out.println(args[1]);

	
		
	
	}
}
class class2{
	public static void main(String args []){
		System.out.println(" finally class 2 is working");
		class3.main(args);
	}
}
class class3{
	public static void main(String args []){
		System.out.println(" finally class 3 is working");
	}
}
