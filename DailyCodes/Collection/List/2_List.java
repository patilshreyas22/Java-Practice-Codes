import java.util.*;

class ArrayListDemo{
	
	public static void main(String args []){
	
		List<Integer> list = new ArrayList<>();

		for(int i = 10 ; i<= 100 ; i=i+10){
			
			list.add(i);
		
		}

		System.out.println(list);
	
	}

}
