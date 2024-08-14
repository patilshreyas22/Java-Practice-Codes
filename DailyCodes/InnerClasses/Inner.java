class Outer{


	
	int x = 10;

	static int y = 20;

	Outer(){
		
		System.out.println("In Outer Constructor");
		System.out.println(x);
		System.out.println(y);
	
	}

	class Inner{
		
		int x = 30;
		
		Inner(){
		
			int x = 40;
			System.out.println("In Inner Constructor");
			System.out.println(x);
			

			
		
		}
	
	}

	public static void main(String args []){
	
		Outer obj = new Outer().new Inner(); // incompatible types: Outer.Inner cannot be converted to Outer
						     // so basically the INNER CLASS is NON-STATIC so we need to make its object by tying it to the object of OUTER CLASS
						     // the non-static inner class must be associated with an instance of the 'Outer' class 
						     // This is because a non-static inner class inherently has access to the instance (Non - static) and Static as well variables
						     //  and methods of its enclosing 'Outer' class

	}


}
