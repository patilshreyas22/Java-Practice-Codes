import java.io.*;

class code12{

	public static void main(String args [])throws IOException{
	
	
	
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));


		System.out.print("Enter Your Name : ");

		String Name = br.readLine();

		System.out.print("Enter Society Name : ");

		String SocName = br.readLine();

		System.out.print("Enter the Flat No. : ");

		int flat = Integer.parseInt(br.readLine());

		System.out.print("Enter the Wing : ");

		char wing = (char)br.read();

		System.out.println(Name);

		System.out.println(SocName);
		
		System.out.println(flat);
	
		System.out.println(wing);
	
	
	
	}



}
