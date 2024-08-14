class Outer{
	
	int x = 10;

	static int y = 20;

	Outer(){
		
		System.out.println("In the Constructor of the Outer Class");
		System.out.println("Global Variable of Outer Class : " + x);
		System.out.println("Global Static Variable of Outer Class : " + y);
	
	}

	class Inner{
	
		int x = 30;

		static int y = 40;

		Inner(){
		
			int x = 50;

			System.out.println("In the Constructor of the Inner Class");

			System.out.println("Local Variable of Inner Constructor : " + x);
			
			System.out.println("Global Variable of Inner Class : " + this.x);

			System.out.println("Global Variable of Outer Class : " + Outer.this.x);
			
		
		}

	
	}

	public static void main(String args []){
	
		Inner obj = new Outer().new Inner();
	
	}


}
