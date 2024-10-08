import java.util.*;

class ForEachDemo{

	public static void main(String args []){
	
		
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		System.out.println(al);

		for(Integer x : (Integer)al){ //Error : ArrayList cannot be converted to Integer
			
			System.out.println(x);
		
		}
	
	
	}

}
