import java.util.*;

class ForEachDemo{

	
	public static void main(String args []){
	
		ArrayList<String> al = new ArrayList<String>();

		al.add("Shreyas");
		al.add("Aditya");
		al.add("Shrishti");
		al.add("Suresh");
		al.add("Ananya");
		al.add("Krish");

		for(Object x : al){  //String can be converted to Object so it doesnt throw any error
			
			System.out.println(x);
		
		}
	
	}

}
