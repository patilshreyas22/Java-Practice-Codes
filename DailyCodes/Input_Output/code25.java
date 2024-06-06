import java.io.*;

class code25{


	public static void main(String args [])throws IOException{
	
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		String name = br.readLine();

		//br.close();
		

		String clgName = br.readLine();

		System.out.println(name);
	
	
	}


}
