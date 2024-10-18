import java.util.*;

public class PetyaString{

	

	
	
	static int operations(String l1 , String l2){
	
		int l1_sum=0;
		int l2_sum=0;	
	
		for(int i = 0 ; i<l1.length() ; i++){
			
			if(Math.abs((int)l1.charAt(i)-(int)l2.charAt(i)) == 32){
			
				
					
			}else if(Math.abs((int)l1.charAt(i)-(int)l2.charAt(i)) == 0){			
				

				

			}else{
				
				if((int)l1.charAt(i) > (int)l2.charAt(i)){
					
					l1_sum++;
				}else{
					
					l2_sum++;
				}
				
				
			
			}
		}

		if(l1_sum>l2_sum){
			
			return 1;
		
		}else if(l1_sum<l2_sum){
			
			return -1;
		}
	
	return 0;
	}


	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);

		String line_1 = sc.nextLine();

		String line_2 = sc.nextLine();
		
		
		System.out.println(operations(line_1 , line_2));
	}


}
