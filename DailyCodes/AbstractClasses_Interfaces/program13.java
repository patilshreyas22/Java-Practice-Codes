abstract class parent{

	abstract void marry();

}
abstract class child extends parent{


	

}
class client{

	public static void main(String args []){
	
	// as the child class doesnt give the body to the parent class method marry() , the child class itself has to be declared as abstract as well , as a result we cannot even make the object of child class as well.	

	
	}

}
