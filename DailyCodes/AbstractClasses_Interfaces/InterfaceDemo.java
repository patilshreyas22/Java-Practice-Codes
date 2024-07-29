// if the class is 100% abstract , that is every method in a class doesnt have a body , then dont declare the class as abstract , declare the class as Interface 

interface Parent{

	void career();

	void marry();

}

class Child implements Parent{

	public void career(){  // The methods declared in a Interface are implicitly PUBLIC and ABSTRACT , Therefore when implementing these methods in a class , they must also be PUBLIC
	
		System.out.println("SDE");
	}

	 public void marry(){
	
		System.out.println("Alia Bhatt");
	}


}

class Client{

	public static void main(String args []){
	
	Parent obj = new Child();

	obj.career();

	obj.marry();
	
	}
}
