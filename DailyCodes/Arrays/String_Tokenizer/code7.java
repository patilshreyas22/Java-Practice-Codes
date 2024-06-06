import java.io.*;

class code7{


	public static void main(String args [])throws IOException{
	
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter Your Name : ");

	String Name = br.readLine();

	System.out.print("Enter Your Soc Name : ");

	String Soc = br.readLine();

	System.out.print("Enter Flat No : ");

	int flat = Integer.parseInt(br.readLine());

	System.out.println(Name);
	
	System.out.println(Soc);
	
	System.out.println(flat);
	
	
	
	
	
	}




}
