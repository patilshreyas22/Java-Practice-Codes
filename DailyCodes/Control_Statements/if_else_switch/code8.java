import java.io.*;
class code8{

	public static void main(String args [])throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));


	System.out.print("Before Switch");
	System.out.print("Please Enter a Number: ");

	int num = Integer.parseInt(br.readLine());

	switch(num){
	
		case 1 : 
			System.out.println("One");
	
		case 2 : 
			System.out.println("Two");
	
		case 3 : 
			System.out.println("Three");
	
		case 4 : 
			System.out.println("Four");
	
	
	
	
	}
	

	System.out.print("After Switch");
	
	}


}
