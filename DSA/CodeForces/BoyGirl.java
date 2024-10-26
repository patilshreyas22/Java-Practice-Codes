import java.util.*;

public class BoyGirl{

	

	public static void main(String args []){
	
		
		Scanner sc = new Scanner(System.in);

		String username = sc.nextLine();

		Set<Character> uniquewords = new LinkedHashSet<Character>();
		

		for(int i = 0 ; i<username.length() ; i++){
				
			uniquewords.add(username.charAt(i));

		}

		if(uniquewords.size()%2==0){
			
			System.out.println("CHAT WITH HER!");
		
		}else{
			
			System.out.println("IGNORE HIM!");
		
		}
	
	}



}
