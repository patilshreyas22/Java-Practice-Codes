import java.io.*;

class code4{


	public static void main(String args [])throws IOException{
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Please Enter a Number : ");

	int num = Integer.parseInt(br.readLine());

	System.out.println("Table of " + num + " is : ");

	for(int i = 1 ; i<=10 ; i++){
	
	
		System.out.println(num*i);
	
	}
	
	
	}



}
