import java.util.*;
class code29{

	public static void main(String args []){
	System.out.println("Before Switch");

	char  x = 97; 

	switch(x){
	
		case 97 : 
			System.out.println("String Worked");
			System.out.println("true it is");
	
		         break;

		case 'a' :  // Error : Duplicate case label
			
			System.out.println("String Worked");
			System.out.println("false it is");
			break;
	
			
		default :
			System.out.println("Invalid");
	
	
	
	}
	

	System.out.println("After Switch");
	
	}


}
