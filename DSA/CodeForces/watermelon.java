import java.util.*;
public class watermelon{
		
	static boolean isEven;
		
	static boolean operations(int weight){
		
		if(weight%2==0 && weight > 2){
			
			isEven = true;
		}else{
			
			isEven = false;
		
		}

	return isEven;
	}

	public static void main(String args []){
	
		
		Scanner sc = new Scanner(System.in);
		
		int weight = sc.nextInt();

		if(weight<=100 && weight>=1){
			
			if(operations(weight)==true){
				
				System.out.println("YES");
			}else{
				
				System.out.println("NO");
			
			}
		
		}else{
			
			
		
		}	
		
	
		
	}

}
