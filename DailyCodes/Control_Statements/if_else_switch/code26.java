import java.util.*;
class code26{

	public static void main(String args []){
	System.out.println("Before Switch");

	long  x = 1; // possble lossy conversion from long to int ,, 8 bytes to 4 bytes
	

	switch(x){
	
		case 0 : 
			System.out.println("String Worked");
			System.out.println("0 it is");
	
		         break;

		case 1 : 
			
			System.out.println("String Worked");
			System.out.println("1 it is");
			
		         
	
		case 2 : 
			
			System.out.println("String Worked");
			System.out.println("2 it is");
	               
		         break;
			
		case 3 : 
			
			System.out.println("String Worked");
			System.out.println("3 it is");
			break;
	
			
		default :
			System.out.println("Invalid");
	
	
	
	}
	

	System.out.println("After Switch");
	
	}


}
