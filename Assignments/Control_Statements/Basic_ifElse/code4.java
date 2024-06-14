import java.io.*;
class code4{


	public static void main(String args [])throws IOException{
	
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			System.out.println("Enter the character to be checked : ");	
			
			char ch = br.readLine().charAt(0);

			if(ch>=65 && ch<=90){
			
				System.out.println(ch + " is UPPERCASE");
			}
			else if(ch>=97 && ch<=122){
			
				System.out.println(ch + " is LOWERCASE");
			}
	
	}


}
