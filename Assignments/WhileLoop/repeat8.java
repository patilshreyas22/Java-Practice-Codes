import java.io.*;

class repeat8{


	public static void main(String args [])throws IOException{
	
	
	InputStreamReader isr = new InputStreamReader(System.in);

	BufferedReader br = new BufferedReader(isr);

	System.out.print("Enter a Number : ");

	int number = Integer.parseInt(br.readLine());

	int prod = 1;

	while(number>0){
	
	
		int digit = number % 10;

		if(digit%2!=0){
		
			prod = prod * digit;
		
		
		}

		number = number / 10;
	
	
	}

	System.out.println(prod);
	
	
	}


}
