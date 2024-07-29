class Parent{

	void career(){
	
		System.out.println("Software Engineering");
	}

     abstract void marry();

}

class Child extends Parent{

	void marry(){
	
		System.out.println("Disha Patani");
	} // so if you declare marry method abstract then you have to make the parent class abstract as well cause even if a single method is abstract then the class is also has to be abstract

}
class Client{

	public static void main(String args []){
	
		Parent obj = new Child();

		obj.career();

		obj.marry();
	
	}


}
