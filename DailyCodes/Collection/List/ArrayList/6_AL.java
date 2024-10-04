import java.util.*;

class ArrayListMethods{
	
	// This program shows that , when we directly create the instance of the ArrayList class without extending it , we cannot use the removeRange() method , so we can use a alternative
	// which is the subList().clear() method , which does the same work

	public static void main(String args []){
		
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);
		
		//removing elements from index 1 to 2
		al.subList(1,3).clear();

		System.out.println(al);
	
	}


}
