import java.util.*;

class VectorDemo{
	
	public static void main(String args []){
	
		
		Vector v = new Vector();

		//add(E e) : Appends the specfied element to the end of the vector
		  v.add('Y');
		 
		//addElement(E obj) : adds the specified component to the end of this vector.(Legacy Method)
		  v.addElement("Shreyas");

		//add(int index , E element) : Inserts the specfied element at the specified position in the vector
		  v.add(2,97.45);

		  System.out.println("Vector : " + v);

		  
		 System.out.println("Second Element : " + v.get(2));

		 System.out.println("First Element : " + v.firstElement());

		 System.out.println("Last Element : " + v.lastElement());

		 System.out.println("elementAt(1) : " + v.elementAt(1));

		 System.out.println("Removing the first element... ");

		 v.remove(0);

		 System.out.println(v);

		 v.removeAll(v);

		 System.out.println(v);

		  	  	
	}

}
