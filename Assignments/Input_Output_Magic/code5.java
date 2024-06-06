import java.util.*;

class code5{

	public static void main(String args []){
	
	
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = sc.nextInt();

		if(num>160 || num<=0){
		
			System.out.println(num + " is not in the table of 16");
		
		}
		else if(num%16==0){
		
			System.out.println(num + " is in the table of 16");
		
		}
		else{
			System.out.println(num + " is not in the table of 16");
		
		}

	
	
	}


}
