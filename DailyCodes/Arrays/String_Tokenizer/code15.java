import java.io.*;

class code15{

	public static void main(String args [])throws IOException{
	
	
	
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));


		System.out.print("Enter Your Name : ");

		String Name = br.readLine();

		System.out.print("Enter Society Name : ");

		String SocName = br.readLine();

		System.out.print("Enter the Wing : ");

		char wing = (char)br.read();

		br.skip(3);

		System.out.print("Enter the Flat No. : ");

		String  flat = br.readLine();
	
	
		System.out.println(Name);	
	
		System.out.println(SocName);	
	
		System.out.println(wing);	

		System.out.println(flat);	

	}
}

