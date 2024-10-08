import java.util.*;

class ForEachDemo{
	
	public static void main(String args []){
	
		
		ArrayList<Object> al = new ArrayList<Object>();

		al.add(10);
		al.add(20);
		al.add("Aditya");
		al.add(40);
		al.add(50);
		al.add("Shreyas");

		for(Object x : al){ 
			
			System.out.println(x);
		
		}
	
	}

}
