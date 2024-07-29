abstract class Parent{

	Parent(){
		System.out.println("Parent Constructor is Called");
	}

}
class Child extends Parent{


	
}
class Client{

	public static void main(String args []){
	
		Parent obj = new Child();
	
	}
}
