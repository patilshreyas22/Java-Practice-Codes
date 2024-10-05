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

		  Vector vector = new Vector();

		  vector.addAll(v);

		  System.out.println("New Vector by addAll : " + vector);
	
	}

}
