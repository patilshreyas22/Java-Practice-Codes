import java.io.*;

class code2{

	public static void main(String args [])throws IOException{
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please Enter Your Age : ");

		int age = Integer.parseInt(br.readLine());

		if(age<0){
		
		
			System.out.println("Invalid Age");
		
		}
		else if(age>=0 && age<18){
		
			System.out.println("Not Eligible for Voting");
		
		}
		else{
		
			System.out.println("ELigible for Voting");
		
		}


	
	}


}
