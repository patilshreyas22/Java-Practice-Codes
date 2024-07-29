// An abstract class is a class that is declared abstract - it may or may not include abstract methods. Abstract class cha object nahi banu shakat , but they can be subclassed.
//
// In a class , if every method has been provided with a body , such classes are "Concrete Classes"


abstract class Parent{

	void career(){
	
		System.out.println("Software Engineer");
	}

	void marry(){
	
		System.out.println("Alia Bhatt");
	
	}


}
class Child extends Parent{

	void marry(){
	
		System.out.println("Disha Patani");
	}


}

class Client{

	public static void main(String args []){
	
		Parent obj = new Child();  // parent cha reference ani child cha object , 
					   // hya scenario madhe , method tyachich call honar jyacha object ahe
	
		obj.career();

		obj.marry();
	}

}
