abstract class parent{

	abstract void marry();


}
class child extends parent{

	void marry(){
	
		System.out.println("Disha Patani");
	
	}


}
class Client{

	public static void main(String args []){
	
		parent obj = new child();

		obj.marry();
	
	}

}
