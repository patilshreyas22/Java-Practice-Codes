class class1{
public static void main(String args []){
System.out.println("class 1 is good");
String[] arr = {"hi" , "hello" , "namaste"}; 
//System.out.println(args[0]);
//System.out.println(args[1]);
class2.main(args);
class3.main(args);
}
}
class class2{
	public static void main(String args []){
	System.out.println("class 2 was good");
	//class3.main(arr);
	}
}
class class3{
	public static void main(String args []){
	System.out.println("class 3 will be good");
	}
}
