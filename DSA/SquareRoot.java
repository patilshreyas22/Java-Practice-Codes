import java.util.*;

//this code performs n number of iterations , jevda motha number , tevdhe iterations , so we need to make the iterations lesser some how

class client{
	
	//static int itr = 0;

	static int operations(int number){
	
		int root = 0;
		for(int i = 1 ; i<=number ; i++){
			//itr++;
			if(i*i<=number){  // here first it was , i*i==number , which works only for perfect square
					  // if you write i*i <= number , then it is for any number , the square root of closest perfect square will be stored in root
				
				root = i;
				//break;
			
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

		//System.out.println(itr);
	
	}


}
