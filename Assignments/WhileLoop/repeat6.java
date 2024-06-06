import java.io.*;

class repeat6{



	public static void main(String args [])throws IOException{
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter a Number : ");

	int number = Integer.parseInt(br.readLine());
	int prod = 1;
	while(number>0){
	
	
	
		int digit = number % 10;

		prod = prod * digit;

		number = number / 10;
		
	
	
	}
		System.out.println(prod);	
	
	}


}
