import java.util.*;

class ArrayListMethods extends ArrayList{
	
	public static void main(String args []){
		
		ArrayListMethods al1 = new ArrayListMethods();

		ArrayList al2 = new ArrayList();

		al2.add("Shreyas");
		al2.add("Aditya");
		al2.add("Pranita");
		al2.add("Tejas");

		al1.addAll(al2);
		
		// removeRange(int fromIndex , int toIndex)
		// al2.removeRange(1,3); //(startIndex , endIndex-1) , HERE IT WILL THROW A COMPILATION ERROR THAT THE removeRange() method in the ArrayList class is Protected , so to use 
		// 							this method , we need to be inside of a subclass of ArrayList
		
		al1.removeRange(1,3);

		System.out.println("al1 : " + al1);

		System.out.println("al2 : " + al2);


		//removeAll(Collection<?> c)
		//al2.removeAll(al2); this works , no error
		
		al2.removeAll(al1);  //all the common elements from al1 and al2 will be removed from al2 , as we have passed al1 as argument

		System.out.println("al2.removeAll(al1)");

		System.out.println("al1 : " + al1);
		System.out.println("al2 : " + al2);
	
	}


}
