import java.util.*;

class ArrayListMethods{
	
	public static void main(String args []){
		
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);
		
		System.out.println("Replacing the element at index 0");

		al.set(0 , 50); //this method replaces the element at the specified index

		System.out.println(al);
	
	}


}
