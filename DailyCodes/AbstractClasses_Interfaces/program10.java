abstract class parent{

	abstract void career();

	abstract void marry();

	abstract void divorce();

}

class child extends parent{

	void marry(){
	
		System.out.println("I will marry whoever i want");
	}

}
class client{

	public static void main(String args []){
	
	
		parent obj = new child();

		obj.marry();
	}

}
