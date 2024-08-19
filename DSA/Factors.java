import java.io.*;

class Factors{
	
	public static void main(String args [])throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number : " );

		int number = Integer.parseInt(br.readLine());

		int count = 0;

		if(number>0){

		System.out.println("Looking for factors of " + number);

		for(int i = 1; i<=number ; i++){
			
			if(number%i == 0){
				
				System.out.println(i + " is a factor of " + number);
				count++;
			
			}
		
		}
		
		}else{
			
			System.out.println("Invalid Number");
		
		}

		System.out.println("Total factors of " + number + " : " + count);
	
	
	}


}
