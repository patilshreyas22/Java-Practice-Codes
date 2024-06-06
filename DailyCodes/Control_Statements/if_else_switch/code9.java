import java.io.*;
class code9{

	public static void main(String args [])throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));


	System.out.println("Before Switch");
	System.out.print("Please Enter a Number: ");

	int num = Integer.parseInt(br.readLine());

	switch(num){
	
		case 1 : 
			System.out.println("One");
	
		case 2 : 
			System.out.println("Two");
			break;
	
		case 3 : 
			System.out.println("Three");
	
		case 4 : 
			System.out.println("Four");
	
	
	
	
	}
	

	System.out.print("After Switch");
	
	}


}
