import java.io.*;

public class Team{

	
	static int InputOperations(BufferedReader br , int problems)throws IOException{
		
	        int count = 0;

		for(int i = 0 ; i<problems ; i++){
			
			String Sure = br.readLine();

			if(Sure.charAt(0)=='1' && Sure.charAt(2)=='1'){
				
				count++;
			}else if(Sure.charAt(0)=='1' && Sure.charAt(4)=='1'){
				
				count++;

			}else if(Sure.charAt(2)=='1' && Sure.charAt(4)=='1'){
				
				count++;
			}

			
		}

		
		return count;
	}





	public static void main(String args [])throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int problems = Integer.parseInt(br.readLine());

		System.out.println(InputOperations(br ,problems));	
	
	
	}
	




}
