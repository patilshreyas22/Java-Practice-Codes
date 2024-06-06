import java.io.*;
class code3{


	public static void main(String args [])throws IOException{
	
	
	
	InputStreamReader isr = new InputStreamReader(System.in);

	BufferedReader br = new BufferedReader(isr);
	
	System.out.print("Please Enter Your Name : ");

	String Name = br.readLine();

	System.out.print("Please Enter Society Name : ");

	String SocName = br.readLine();

	System.out.print("Please Enter Wing of the Society : ");

	char wing = br.readLine(); // Error : String cannot be converted to char 
	
	
	}






}
