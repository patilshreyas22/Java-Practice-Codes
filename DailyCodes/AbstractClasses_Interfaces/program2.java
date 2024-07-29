class Parent{

	void career(){
	
		System.out.println("Software Engineering");
	}

      void marry();

}

class Child extends Parent{

	void marry(){
	
		System.out.println("Disha Patani");
	} //here as we are overriding this method which doesnt have a body in the parent class , it will throw a error that missing body or declare abstract , so if you declare that method abstract then you have to make the parent class abstract as well cause even if a single method is abstract then the class is also has to be abstract

}
class Client{

	public static void main(String args []){
	
		Parent obj = new Child();

		obj.career();

		obj.marry();
	
	}


}
