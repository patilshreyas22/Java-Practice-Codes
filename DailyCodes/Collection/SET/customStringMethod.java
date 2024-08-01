import java.util.*;

class CustomString implements Comparable<CustomString>{  //here you need to specify the generic type <CustomString> , it defines that the compareTo method is defined for comparing the 
							 //CustomString objects
							 //This class implements Comparable<CustomString> whcih means the instances of the CustomString class can be compared to each other

	String str = null;

	CustomString(String str){
	
		this.str = str;
	}

	public int compareTo(CustomString str1){  //compareTo method from the String class compares two Strings LEXICOGRAPHICALLY.
						  //-1 : this.str is less than str1.str
						  //0 : this.str is equal to str1.str
						  //1 : this.str is greater than str1.str
	
		return -(str.compareTo(str1.str));  
		
						
	}
						// If we are not using the toString method of the object class , the default implementation of the toString method from the object class
						    // is used , this default implementation prints the class Name followed by the @ symbol and a hexadecimal representation of the objects
						    // hash code which is derived from the identityhashcode

	
	public String toString(){
	
		return str;
	}



}

class SortedDemo{

	public static void main(String args []){
	
		TreeSet t = new TreeSet();

		

		t.add(new CustomString("Kanha"));  //Initially the TreeSet is Empty , "Kanha" is added without any comparison needed
		
		
		
		t.add(new CustomString("Rahul"));  
						   //str.compareTo(str1.str) is "Rahul".compareTo("Kanha"), which returns a positive integer (because "Rahul" > "Kanha")
						   //return -("Rahul".compareTo("Kanha")) returns a negative integer, meaning "Rahul" should be placed before "Kanha".

		
		
		t.add(new CustomString("Badhe"));  
						   //str.compareTo(str1.str) is "Badhe".compareTo("Rahul"), which returns a negative integer (because "Badhe" < "Rahul").
						   //return -("Badhe".compareTo("Rahul")) returns a positive integer, meaning "Badhe" should be placed after "Rahul".
		
		
		
		
		t.add(new CustomString("Ashish"));
		t.add(new CustomString("Shashi"));
		t.add(new CustomString("Shreyas"));
		
		System.out.println("Print the String in the Descending Order using the CustomString Method");
		
		
		System.out.println(t);
	}

}
