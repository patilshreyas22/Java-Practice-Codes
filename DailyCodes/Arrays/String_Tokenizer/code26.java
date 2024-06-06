import java.util.*;

class code26{


	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Info : ");
		String info = sc.nextLine();

		StringTokenizer st = new StringTokenizer(info,"@#!");

			while(st.hasMoreTokens()){
			
				System.out.println(st.nextToken());
			
			
			}
	
	
	
	
	
	
	}



}
