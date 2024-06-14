import java.io.*;

class repeat4{


	public static void main(String args [])throws IOException{
	
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number : ");

		int number = Integer.parseInt(br.readLine());

		while(number>0){
		
			int digit = number % 10;

			if(digit%2!=0){
			
				if(digit==0){
				
				
				}
				else{
				
					System.out.println(digit*digit);
				
				}


		
			
			
			}

			number = number / 10;
		
		
		
		}
	
	
	
	
	
	}




}
