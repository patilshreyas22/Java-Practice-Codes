import java.util.*;

class ArrayListMethods extends ArrayList{
	
	public static void main(String args []){
		
		//addAll(Collection<? extends E> c) //adds element from one collection to another
		
		ArrayListMethods al1 = new ArrayListMethods();

		al1.add(20);
		al1.add("Shreyas");
		al1.add(45.11);

		ArrayList al2 = new ArrayList();

		al2.add("Shreyas");
		al2.add("Shreyas");
		al2.add("Shreyas");
		al2.add("Shreyas");

		al1.addAll(al2);

		System.out.println(al1);
		System.out.println(al2);
	
	}


}
