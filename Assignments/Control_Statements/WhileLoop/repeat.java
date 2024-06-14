import java.io.*;

class repeat{

                                                      
	public static void main(String args [])throws IOException{
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a Number : ");
		int Num = Integer.parseInt(br.readLine());
		int temp = 0;
		while(Num>0){
		
			int digit = Num % 10;

			if(digit%2==0){
			
				System.out.println(digit);

			}
			
			
			Num = Num / 10;
			
		
		}
	
	
			
	}



}
