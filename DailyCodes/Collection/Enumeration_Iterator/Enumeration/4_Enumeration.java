import java.util.*;

class Demo{

	int x ;

	Demo(int x){
		
		this.x = x;
	}

	int printData(){
		
		return x;
	
	}

	public String toString(){
		
		return printData()+""; 
	
	}

}

class VectorDemo{
	
	public static void main(String args []){
	
		Vector<Demo> v = new Vector<>();  
						
		v.addElement(new Demo (10));	
		v.addElement(new Demo (20));	
		v.addElement(new Demo (30));	
		v.addElement(new Demo (40));	
		v.addElement(new Demo (50));	

		System.out.println(v); 


	}


}
