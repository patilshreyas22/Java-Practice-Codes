import java.util.*;

class Demo{

	int x ;

	Demo(int x){
		
		this.x = x;
	}

	void printData(){
		
		System.out.println(x);
	
	}

}

class VectorDemo{
	
	public static void main(String args []){
	
		Vector<Demo> v = new Vector<>(); //The vector here will hold the Demo objects , so when you print an object in java , the SOP method internally calls the toString() method 
						 //of the object . if the class does not override the toString() method , the default implementation from the Object class is used

		v.addElement(new Demo (10));	
		v.addElement(new Demo (20));	
		v.addElement(new Demo (30));	
		v.addElement(new Demo (40));	
		v.addElement(new Demo (50));	

		System.out.println(v); 


	}


}
