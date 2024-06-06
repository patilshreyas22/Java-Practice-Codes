import java.io.*;
class code14{

	public static void main(String args [])throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));


	
	System.out.print("Please Enter a Number: ");

	int num = Integer.parseInt(br.readLine());
	System.out.println("Before Switch");
	

	switch(num){
	
		case 1 : 
			System.out.println("One");
	
		         break;

		case 2 : 
			System.out.println("Two");
			
	
		case 3 : 
			System.out.println("Three");
	               
			
		case 4 : 
			System.out.println("Four");
			break;
	
			
		default :
			System.out.println("Invalid");
	
	
	
	}
	

	System.out.println("After Switch");
	
	}


}
