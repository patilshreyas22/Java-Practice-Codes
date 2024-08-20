import java.util.*;

//this code performs n number of iterations , jevda motha number , tevdhe iterations , so we need to make the iterations lesser some how

class client{


	static int operations(int number){
	
		int root = 0;
		for(int i = 1 ; i<=number ; i++){
			
			if(i*i==number){
				
				root = i;
			
			}
		
		}

		return root;
	
	}

	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");

		int number = sc.nextInt();
		
		int root = operations(number);
	
		System.out.println("The root of " + number + " is " + root);
	
	}


}
