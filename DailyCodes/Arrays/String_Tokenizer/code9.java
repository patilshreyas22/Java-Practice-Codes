import java.io.*;

class code9{



	public static void main(String args [])throws IOException{
	
	
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		System.out.print("Enter Your Name : ");

		String Name = br.readLine();

		System.out.print("Enter Your Society Name : ");

		String Soc = br.readLine();

		System.out.print("Enter Wing : ");

		char Wing = (char)br.read();

		//System.out.print("Enter Flat No. : ");

		//int Flat = Integer.parseInt(br.readLine());

		System.out.println(Name);
	
		System.out.println(Soc);
	
		System.out.println(Wing);
	
		//System.out.println(Flat);
	
	}





}
