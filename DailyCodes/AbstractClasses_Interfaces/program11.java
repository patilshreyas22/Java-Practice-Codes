abstract class parent{

	abstract void career();

	abstract void marry();

	abstract void divorce();

}

class child extends parent{

	void marry(){
	
		System.out.println("I will marry whoever i want");
	}
	void career(){
	
		System.out.println("I will do whatever i want");
	}
	void divorce(){
		System.out.println("I will not divorce my pookie wife");
	}

}
class client{

	public static void main(String args []){
	
	
		parent obj = new child();

		obj.marry();
	}

}
