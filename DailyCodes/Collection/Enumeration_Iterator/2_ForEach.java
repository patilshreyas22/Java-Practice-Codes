import java.util.*;

class ForEachDemo{

	public static void main(String args []){
		
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
	        al.add("Shreyas");
		al.add("Aditya");
		al.add("Pranita");
		al.add("Shrishti");
		al.add("Tejas");

		System.out.println(al);

		//The data type is heterogeneous type in this case , hence the object is used in for-each loop
		

		for(Object x:al){
			
			System.out.println(x);
		}
	
	}
	
}
