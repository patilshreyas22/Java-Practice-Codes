import java.util.*;

class IteratorExample{

	
	public static void main(String args []){
	
		
		ArrayList<String> list = new ArrayList<>();

		list.add("Shreyas");
		list.add("Aditya");
		list.add("Tejas");
		list.add("Pranita");

		Iterator<String> itr = list.iterator();

		while(itr.hasNext()){
		
			
			System.out.println(itr.next());
		
		}
	
	}

}
