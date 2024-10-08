//In this program I have used the toString method that is i have overrided it and provided it my implementation , as a result this program will print the integers correctly instead of
//the hexadecimal values

import java.util.*;

class CursorDemo{
	
	int x;

	CursorDemo(int x){
		
		this.x = x;
	
	}

	int printData(){
		
		return x;
	
	}

	public String toString(){
		
		return printData()+"";
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
