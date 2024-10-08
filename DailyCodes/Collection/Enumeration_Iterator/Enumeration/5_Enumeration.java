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
class client{
	
	public static void main(String args []){
	
		
		Vector<Demo> v = new Vector<Demo>();

		v.addElement(new Demo(10));
		v.addElement(new Demo(20));
		v.addElement(new Demo(30));
		v.addElement(new Demo(40));
		v.addElement(new Demo(50));
		v.addElement(60); //as the vector holds the Demo instance , this will throw an error of incompatible types , int cannot be converted to Demo

		System.out.println(v);
	
	}


}
