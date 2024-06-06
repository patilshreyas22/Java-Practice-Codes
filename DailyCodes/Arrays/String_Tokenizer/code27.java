// this code is purely for trying out git and github 


class parent{


	int x = 10;
	parent(){
	
	
		System.out.println("In the Parent Constructor");
	
	}

	void fun(){
	
		System.out.println("In Fun");
	
	}



}

class child extends parent{


	int x = 20;
	child(){
	
		System.out.println("In Child Constructor");
	
	
	}

	void run(){
	
		System.out.println("In Run");
		System.out.println(super.x);
	}

	public static void main(String args []){
	
	
		child obj = new child();
		System.out.println(obj.x);

		obj.fun();
		obj.run();



		//System.out.println(super.x);   this will throw a error cause of the non-static variable super
	
	}




}
