abstract class Parent{

	void career(){
		
		System.out.println("SDE");
	
	}

	abstract void marry();

}

class Child extends Parent{


	void marry(){
	
		System.out.println("Tamannah Bhatia");
	
	}

	void career(){
	
		System.out.println("Kheti Wadi");
	
	}

}
class Client{

	public static void main(String args []){
	
		Parent obj = new Child();

		obj.marry();

		obj.career();
	
	}

}
