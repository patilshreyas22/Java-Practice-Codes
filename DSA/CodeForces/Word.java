import java.util.*;

public class Word{
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		String shabd = sc.nextLine();

		int uc = 0;

		int lc = 0;

		for(int i = 0 ; i < shabd.length() ; i++){
			
			if((int)shabd.charAt(i) >= 97 && (int)shabd.charAt(i) <= 122 ){
					
				lc++;
				
			}else if((int)shabd.charAt(i) >= 65 && (int)shabd.charAt(i) <= 90){
			
				uc++;
			}
		
		}

		if(lc > uc){
			
			String lcW = shabd.toLowerCase();

			System.out.println(lcW);
		
		}else if( uc > lc ){
			
			String ucW = shabd.toUpperCase();
			
			System.out.println(ucW);
			
		
		}else{
			
			String equalW = shabd.toLowerCase();


			System.out.println(equalW);
		
		}
	
	}

}
