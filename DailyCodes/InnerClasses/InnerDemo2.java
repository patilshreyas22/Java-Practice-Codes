//a code snippet which shows how to access global variables if there is a variable with same name in the constructor as well
class Outer{

	int x = 10;

	static int y = 20;

	Outer(){

		int x = 30;
	
		System.out.println("In the constructor of Outer Class");
		System.out.println(this.x);
		System.out.println(y);
	
	}

	public static void main(String args []){
		
		Outer outerobj = new Outer();
	
	}


}
