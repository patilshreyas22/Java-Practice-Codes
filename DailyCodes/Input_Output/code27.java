import java.io.*;

class code27{


	public static void main(String args [])throws IOException{
	
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter Employee Name: ");
		String name = br.readLine();

	
		System.out.print("Enter Company Name: ");
		

		String CompName = br.readLine();

		System.out.println("Company Name : " + CompName);
		
		System.out.println("Employee Name : " + name);
		
		
	
	
	}


}
