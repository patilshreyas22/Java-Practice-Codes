import java.util.*;
class code30{

	public static void main(String args []){
	System.out.println("Before Switch");

	char  x = 97; 

	switch(x){
	
		case 97 : 
			System.out.println("String Worked");
			System.out.println("97 it is");
	
		         break;

		case 'b' :  // Error : Duplicate case label
			
			System.out.println("String Worked");
			System.out.println("b it is");
			break;
	
			
		default :
			System.out.println("Invalid");
	
	
	
	}
	

	System.out.println("After Switch");
	
	}


}
