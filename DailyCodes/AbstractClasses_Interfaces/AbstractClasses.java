abstract class Parent{

	void career(){
	
		System.out.println("SDE");
	}

	abstract void marry(){                                // even if single method is abstract , the class should be declared as abstract
							      // But if you declare the class as Abstract Class , then you cannot make its object
							      // also Abstract METHODS cannot have a body as they will be overriden by any other class
	
		System.out.println("Disha Patani");
	}

}

class Child extends Parent{

	void marry(){
	
		System.out.println("Alia Bhatt");
	}


}
class Client{

	public static void main(String args []){
		
		Parent obj = new Child();

		obj.career();

		obj.marry();
	
	}
}
