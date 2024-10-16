import java.io.*;

public class Bits{

	
	static int operations(BufferedReader br , int statements)throws IOException{
	
		int count = 0;

		for(int i = 1 ; i<= statements ; i++){
			
			String instruction = br.readLine();

			if(instruction.charAt(0)=='+' || instruction.charAt(2)=='+'){
				
				count++;
			}else if(instruction.charAt(0)=='-' || instruction.charAt(2)=='-'){
				
				count--;
			}
		
		}
		
		return count;
	
	}


	public static void main(String args [])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int statements = Integer.parseInt(br.readLine());

		System.out.println(operations(br , statements));
	
	}


}
