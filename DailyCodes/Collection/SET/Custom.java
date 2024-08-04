// This code prints the data in the TreeSet in a Descending Order , we have to write a CustomStrin Code for this

import java.util.*;

class Custom implements Comparable<Custom>{


	String str = null;

	Custom(String str){
	
		this.str = str;
	
	}

	public int compareTo(Custom obj){
	
		return -(str.compareTo(obj.str));
	}

	public String toString(){
	
		return str;
	}

}

class Client{

	
	public static void main(String args []){
	
	
		TreeSet<Custom> ts = new TreeSet<Custom>();

		ts.add(new Custom("Brijesh"));

		ts.add(new Custom("Aditya"));
		
		ts.add(new Custom("Chirag"));

		System.out.println(ts);
	
	}

}
