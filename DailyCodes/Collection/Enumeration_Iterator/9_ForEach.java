import java.util.*;

class ForEachDemo{
	
	public static void main(String args []){
	
		
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add("Aditya");
		al.add(40);
		al.add(50);
		al.add("Shreyas");

		for(Integer x : al){ 
			
			System.out.println(x);
		
		}
	
	}

}
