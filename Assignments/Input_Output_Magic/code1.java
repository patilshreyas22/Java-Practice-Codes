import java.io.*;

class code1{

	public static void main(String args [])throws IOException{
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please Enter a Number : ");

		int num = Integer.parseInt(br.readLine());

		System.out.println("Checking whether the Given Number " + num + " is even or odd...");

		if(num%2==0){
		
			System.out.println(num + " is even");
		
		}
		else{
		
			System.out.println(num + " is odd");
		}
	
	
	}




}
