import java.util.*;

class SortedSetDemo{
	
	public static void main(String args []){
	
		SortedSet ss = new TreeSet();

		ss.add(10);
		ss.add("Shreyas");
		ss.add(20);
		ss.add("Aditya");
		// as we are adding two different objects here i.e String Class and Integer Class , JVM cannot compare these two different classes while storing it in the HashTable Buckets , 			as a result it throws a ClassCastException Error
	
		// this exception is thrown by the CompareTo Method of the String Class which is used by the Put Method of the TreeMap Class
		
	}


}
