import java.util.*;

class ArrayListMethods extends ArrayList{

	
	public static void main(String args []){
		
		//ArrayList al = new ArrayList();
	
	ArrayListMethods al = new ArrayListMethods();

	for(int i = 10 ; i<=50 ; i+=10){
	
		
		al.add(i);
	
	}

	al.add(30);
	al.add(40);
	al.add(50);
	al.add("Shreyas");

	int num = (int)al.get(0); //casting the object into int
	
	//char ch  = (char)al.get(8); : will throw an exception that the "String cannot be cast to char"
	
	String name = (String)al.get(8); //casting the 'Object' into 'String'

	System.out.println(name.charAt(0)); //S
					    
	
	System.out.println(num); //10

	
	
	}


}
