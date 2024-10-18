import java.util.*;

public class Fence{
	
	public static void main(String args []){
	
	
		
		Scanner sc = new Scanner(System.in);

		int friends = sc.nextInt();

		int Wall = sc.nextInt();

		int width = 0;

		int height;

		for(int i = 0 ; i<friends ; i++){
			
			height = sc.nextInt();

			if(height>Wall){
				
				width += 2;

			}else if(height < Wall){
			
				width += 1;
			}else if(height == Wall){
			
				width += 1;
			}
		
		}

		System.out.println(width);
	
	
	}


} 
