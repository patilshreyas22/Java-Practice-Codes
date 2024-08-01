import java.util.*;

class SortedSetDemo{

	public static void main(String args []){
		
		//The TreeSet in java used TreeMap internally to store the elements in a sorted order , In the TreeMap "Put" method is used in which the it uses the CompareTo method of the 			String Class to Compare the String and Sort Them
	
		SortedSet<String> ss = new TreeSet<String>();

		ss.add("Kanha");
		ss.add("Rahul");
		ss.add("Ashish");
		ss.add("Badhe");
		ss.add("Rahul");
		ss.add("Shashi");

		System.out.println(ss); //This will print the Ascending Order of the Stored Data as we are using the Sorted Set , No Duplicate Data will be Allowed Here

	
	}

}
