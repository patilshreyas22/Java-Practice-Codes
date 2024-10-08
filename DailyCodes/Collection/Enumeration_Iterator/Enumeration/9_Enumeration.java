//this program shows that when the enumerator or any iterator iterates over a collection which holds an instance of a class , then the SOP line prints a hexadeciman code as the SOP 
//internally calls the toString method of the object class i.e uses the default implementation of the toString method , that is why this code has a output which displays hexdecimal codes
//instead of integer values as 10 , 20 , 30 ...60.

import java.util.*;

class CursorDemo{
	
	int x;

	CursorDemo(int x){
		
		this.x = x;
	
	}

	void printData(){
		
		System.out.println(x);
	
	}


}
class client{
	
	public static void main(String args []){
	
		
		Vector<CursorDemo> vector = new Vector<>();

		vector.addElement(new CursorDemo(10));
		vector.addElement(new CursorDemo(20));
		vector.addElement(new CursorDemo(30));
		vector.addElement(new CursorDemo(40));
		vector.addElement(new CursorDemo(50));
		vector.addElement(new CursorDemo(60));

		Enumeration <CursorDemo> cursor = vector.elements();

		while(cursor.hasMoreElements()){
			
			System.out.println(cursor.nextElement());
		
		}


	
	}

}
