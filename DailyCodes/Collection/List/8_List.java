import java.util.*;

class ListMethods{   
		    
		     
		   // this code tells you that , we can only add elements in a order and not in any index as we want , i.e if the list is filled till the index number 7 , then we cannot add
		   // element to index 9 , 10 or whatsoever , we can only add a element in the index 8 first and then further 9 , 10 .....

	
	public static void main(String args []){
		
		List list = new ArrayList();

		list.add(10);
		list.add(20);

		list.add("Shashi");
		list.add("Kanha");

		System.out.println(list.size()); //4 

		System.out.println(list); 

		list.add(2, "Aditya");
		
		System.out.println(list.get(2)); //Aditya

		System.out.println(list.get(3)); //Shashi

		list.add(4,"Shreyas"); 

		System.out.println(list.get(5)); //Kanha
						 
		System.out.println(list);

		System.out.println("Current Size : " +  list.size());	

		list.add(6, "Om");

		System.out.println(list.get(6));
						 
		list.add(7, "Ram");

		System.out.println(list);

		//System.out.println(list.get(8)); will throw an exception , out of bound
		
		list.add(8 , 98);

		System.out.println(list);


	}

}
		
