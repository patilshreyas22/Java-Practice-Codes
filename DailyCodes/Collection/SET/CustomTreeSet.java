import java.util.*;

class CustomString implements Comparable<CustomString>{

	String str = null;

	CustomString(String str){
	
		this.str = str;
	}

	public int compareTo(CustomString str1){ //returns integer , -1 , 0 , 1 : LEXICOGRAPHIC
		
		return -(str.compareTo(str1.str));
	
	}

	public String toString(){
		
		return str;
	}


}

class Demo{

	public static void main(String args []){
	
		TreeSet t = new TreeSet();

		t.add(new CustomString("Kanha"));
		t.add(new CustomString("Rahul"));
		t.add(new CustomString("Badhe"));
		t.add(new CustomString("Ashish"));
		t.add(new CustomString("Shashi"));
		t.add(new CustomString("Aditya"));
		t.add(new CustomString("Shreyas"));

		System.out.println(t);
	
	}

}
