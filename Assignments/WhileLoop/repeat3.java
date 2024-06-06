import java.io.*;

class repeat3{


	public static void main(String args [])throws IOException{
	
	
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number : ");
		int number = Integer.parseInt(br.readLine());

		while(number>0){
		
		
		int digit = number % 10;

		if(digit%2==0 || digit%3==0){

			if(digit==0){
		
			

			}
			else{
			
				System.out.print(digit);
			
			}
		
		
		}

		number = number / 10;
		
		
		}
	
	
	}


}
