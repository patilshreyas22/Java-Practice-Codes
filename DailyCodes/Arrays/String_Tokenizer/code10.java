import java.io.*;

class code10{



	public static void main(String args [])throws IOException{
	
	
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		System.out.print("Enter Your Name : ");

		String Name = br.readLine();

		System.out.print("Enter Your Society Name : ");

		String Soc = br.readLine();

		System.out.print("Enter Wing : ");

		char Wing = (char)br.read();

		System.out.print("Enter City : ");

		String city = br.readLine();

		

		System.out.println(Name);
	
		System.out.println(Soc);
	
		System.out.println(Wing);

		System.out.println(city); // as we have used bufferedreader and br.read() , it will take the '\n' as an input for anything after the (char) wing input , the \n is stored in the bufferedreader
	
		
	
	}





}
