import java.util.*;

class CustomString implements Comparable<CustomString>{  //here you need to specify the generic type <CustomString> , it defines that the compareTo method is defined for comparing the 
							 //CustomString objects

	String str = null;

	CustomString(String str){
	
		this.str = str;
	}

	public int compareTo(CustomString str1){
	
		return -(str.compareTo(str1.str));  // If we are not using the toString method of the object class , the default implementation of the toString method from the object class
						    // is used , this default implementation prints the class Name followed by the @ symbol and a hexadecimal representation of the objects
						    // hash code which is derived from the identityhashcode
	}

	
	public String toString(){
	
		return str;
	}



}

class SortedDemo{

	public static void main(String args []){
	
		TreeSet t = new TreeSet();

		

		t.add(new CustomString("Kanha"));
		t.add(new CustomString("Rahul"));
		t.add(new CustomString("Badhe"));
		t.add(new CustomString("Ashish"));
		t.add(new CustomString("Shashi"));
		t.add(new CustomString("Shreyas"));
		
		System.out.println("Print the String in the Descending Order using the CustomString Method");
		System.out.println(t);
	}

}
