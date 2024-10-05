import java.util.*;

class ForEachDemo{

	public static void main(String args []){
		
		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
	      /*al.add("Shreyas");
		al.add("Aditya");
		al.add("Pranita");
		al.add("Shrishti");
		al.add("Tejas");*/

		System.out.println(al);

		//FOR EACH LOOP 
		//for(Type element : collection){} : If the list contains different types of elements , such as a mix of Integer , String , Double , etc then treat them as Object type 
                //		     i.e for(Object x : al) 

		

		for(int x:al)     //if we dont provide the type (here : int) , then it throws a error : bad initializer for for-loop  
		{ 
			
			System.out.println(x);
		}
	
	}
	
}
