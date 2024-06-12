class Outer{

	int x = 20;
	static int y = 30;
	Outer(){
	
		System.out.println("In Outer Constructor");
	
	}



	class Inner{
	
		//int x = 40;
	
	Inner(){
		 int x = 40;
		System.out.println("In Inner Constructor");
		System.out.println(Outer.this.x);
		
		System.out.println(y);
		
	}

	
	
	
	
	
	
	}

	public static void main(String args []){
	
	
		Inner obj = new Outer().new Inner();
	
	
	}

}
