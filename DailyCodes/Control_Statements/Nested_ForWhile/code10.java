import java.io.*;

class code10{

	public static void main(String args [])throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("Enter a number : ");
		int table = Integer.parseInt(br.readLine());
		System.out.println("table of " + table + " is :" );
		
		for(int i = 1 ; i<=10 ; i++){
		
			System.out.println(table * i);
		
		}
	
	
	}


}
