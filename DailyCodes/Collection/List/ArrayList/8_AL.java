import java.util.*;

class MyArrayList extends ArrayList{
	
	 public void MyRemoveRange(int fromIndex , int toIndex){
		
		super.removeRange(fromIndex , toIndex);
	
	}
	
	
}

class client{
	
	public static void main(String args []){
		
		MyArrayList list = new MyArrayList();

		list.add(10);
		list.add('S');
		list.add(11.98);
		list.add("Aditya");
		list.add(9823740033L);

		list.MyRemoveRange(0 , 3);

		System.out.println(list);
		
	
	}

}
