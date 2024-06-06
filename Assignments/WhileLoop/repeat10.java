import java.io.*;

class repeat10{


	public static void main(String args [])throws IOException{
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Please Enter a Number : ");

	int number = Integer.parseInt(br.readLine());

	int oddsum = 0;
	int evenprod = 1;

	while(number>0){
	
	int digit = number % 10;

	if(digit%2==0){
	
	
	evenprod = evenprod * digit;
	
	}
	else if(digit%2!=0){
	
	
	oddsum = oddsum + digit;
	
	}
	
	number = number / 10;
	
	}

	System.out.println("Sum of odd digits : " + oddsum);

	System.out.println("Product of even digits : " + evenprod);
	
	
	
	}


}
