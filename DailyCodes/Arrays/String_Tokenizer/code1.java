import java.io.*;

class code1{

	public static void main(String args [])throws IOException{
	
	
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

	System.out.println("Enter Your Name : ");

	String name = br.readLine();

	System.out.println("Enter Society Name : ");

	String socname = br.readLine();

	System.out.println("Enter Your Wing : ");

	String wing = br.readLine();

	System.out.println("Enter Your Flat No. : ");

	String FlatNo = br.readLine();


	System.out.println(name);
	
	System.out.println(socname);
	
	System.out.println(wing);
	
	System.out.println(FlatNo);
	}



}
