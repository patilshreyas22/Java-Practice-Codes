import java.util.*;

/*class CustomString implements Comparable{

	String str = null;
	CustomString(String str){
	
		this.str = str;
	}

}*/

class SortedSetDemo{

	public static void main(String args []){
	
		TreeSet t = new TreeSet();

		t.add("Aditya");
		t.add("Shreyas");

		System.out.println(t.descendingSet());
	
	}

}
