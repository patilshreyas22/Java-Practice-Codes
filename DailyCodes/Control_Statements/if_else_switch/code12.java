import java.io.*;
class code12{

	public static void main(String args [])throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));


	System.out.println("Before Switch");
	System.out.print("Please Enter a Number: ");

	int num = Integer.parseInt(br.readLine());

	switch(num){
	
		case 1 : 
			System.out.println("One");
	
		         break;

		case 2 : 
			System.out.println("Two");
			break;
	
		case 3 : 
			System.out.println("Three");
	               
			break;
		case 4 : 
			System.out.println("Four");
	
			
		default :
			System.out.println("Invalid");
	
	
	
	}
	

	System.out.print("After Switch");
	
	}


}
