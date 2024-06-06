import java.io.*;

class code9{

	public static void main(String args [])throws IOException{
		

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number 1: ");

		int num1 = Integer.parseInt(br.readLine());
	
		System.out.print("Enter a Number 2: ");

		int num2 = Integer.parseInt(br.readLine());

		for(int i = num1 ; i<=num2 ; i++){
		
			if(i%2==0){
				
			
				System.out.println(i);
			}
		
		}
	
	}


}
