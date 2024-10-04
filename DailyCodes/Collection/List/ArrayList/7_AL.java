import java.util.*;

class MyArrayList extends ArrayList{
	
	public static void main(String args []){
	
		
		MyArrayList al = new MyArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Shreyas");
		al.add(40);
		al.add('c');
		al.add(43.11);

		System.out.println(al);

		al.removeRange(1,3);

		System.out.println(al);
	
	
	}


}
