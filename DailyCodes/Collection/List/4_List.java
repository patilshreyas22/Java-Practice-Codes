import java.util.*;

//in this program i have explicitly written 'L' after the numbers inserted so that it should be detected as Long . this program doesnt throw any error like the previous 3_List.java does

class ArrayListDemo{
	
	public static void main(String args []){
		
		List list = new ArrayList();

		list.add("Shreyas");
		list.add(7420989799L); 
		list.add("Anil Patil");
		list.add(9823740033L);
		
		System.out.println(list);
	
	}

}
