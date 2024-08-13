class Outer{
	
	int x = 20;
	 int y = 30;

	Outer(){
	
		System.out.println("In Outer Constructor");

	}

	class Inner{
		
		int x = 40;

		Inner(){
			
			System.out.println("In Inner Constructor");
			System.out.println(Outer.this.x);
			System.out.println(y);
			fun();
		
		}
	}

	void fun(){
	
		System.out.println("In Fun Method");
	}

	public static void main(String args []){
		
		Outer obj1 = new Outer();

		Inner obj = obj1.new Inner();
	
	}

}
