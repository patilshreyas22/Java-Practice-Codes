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
	
		Outer obj = new Outer().new Inner();

	}


}
