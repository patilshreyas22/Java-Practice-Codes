import java.io.*;

class code10{


	public static void main(String args [])throws IOException{
	
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter marks for maths : ");

		int maths = Integer.parseInt(br.readLine());
	
		System.out.print("Enter marks for science : ");

		int sci = Integer.parseInt(br.readLine());
	
		System.out.print("Enter marks for english : ");

		int eng = Integer.parseInt(br.readLine());
	
		System.out.print("Enter marks for marathi : ");

		int marathi = Integer.parseInt(br.readLine());
	
	
		System.out.print("Enter marks for hindi : ");

		int hindi = Integer.parseInt(br.readLine());
	
		

		if(maths>100 || sci>100 || eng>100 || marathi>100 || hindi>100){
		
			System.out.println("Invalid Marks");
		
		}
		else if(maths<0 || sci<0 || eng<0 || marathi<0 || hindi<0){
		
			System.out.println("Invalid Marks");
		
		}
		else{
			int total = maths + sci + eng + marathi + hindi;

			System.out.println( total + " out os 400");
		
		}
	
	
	}






}
