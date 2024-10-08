import java.util.*;

class ForEachDemo{
	
	public static void main(String args []){
	
		
		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		for(Object x : al){ //here it doesnt throw an error as Integer class can be converted to Object class 
			
			System.out.println(x);
		
		}
	
	}

}
