import java.io.*;
class Deimo{

	public static void main(String args [])throws IOException{
	
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		int x = 0;

		int y = 0;

		System.out.println("X and Y : ");

		try{
		
			x = Integer.parseInt(br.readLine());

			y = Integer.parseInt(br.readLine());

			System.out.println(x/y);
		
		}catch(IOException ioe){
		
			System.out.println("Connection Closed");
			
		}catch(NumberFormatException nfe){
		
		
			System.out.println("Wrong Input");
		}catch(ArithmeticException ae){
		
			System.out.println("Please Enter Y value again : ");
			y = Integer.parseInt(br.readLine());
			System.out.println(x/y);
		
		}finally{
		
		
			System.out.println("Cleanup Code");
		}
	}

}
