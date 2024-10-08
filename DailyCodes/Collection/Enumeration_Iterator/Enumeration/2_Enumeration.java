// Code from chatgpt 

import java.util.*;

class EnumerationExample{
	
	public static void main(String args []){
		
		Vector vector = new Vector();

		vector.add("Shreyas");
		vector.add("Aditya");
		vector.add("Shrishti");
		vector.add("Krish");
		//vector.add(20);                                     //here it will throw a runtime exception cause the enumeration type below is String

		Enumeration<String> enumeration = vector.elements();  //the elements() method is from the vector class which returns an Enumeration object that can be used to iterate over
								      //elements in the vector , <String> make sures that we only get the string elements during the iteration , if during 
								      //runtime we came across a element which is not String type , then it will throw an exception

		while(enumeration.hasMoreElements()){
			String names = enumeration.nextElement();
			System.out.println(names);
		
		}
	
	
	}


}
