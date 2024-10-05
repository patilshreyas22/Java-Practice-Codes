import java.util.*;

class VectorMethods{
	
	public static void main(String args []){
	
		
		Vector<Integer> vector = new Vector<>(15); //The initial capacity of the vector is 15

		for(int i = 10 ; i<=100 ; i+=10){
			
			vector.addElement(i);
		}

		System.out.println(vector);
		
		//capacity() : returns the capacity of the vector 
		//ensureCapacity(int minCapacity) : Increases the capacity to ensure it can hold at least the number of elements
		//trimToSize() : Trims the capacity of this vector to the current size 
		
		System.out.println("Capacity of Vector : " + vector.capacity()); //15

		vector.trimToSize();

		System.out.println("Capacity after trimToSize : " + vector.capacity()); //10

		System.out.println("Is the vector empty? : " + vector.isEmpty());

		System.out.println("Index of 70 : " + vector.indexOf(70));


	
	}

}
