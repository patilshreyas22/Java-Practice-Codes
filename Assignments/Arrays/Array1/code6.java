import java.util.*;

class code6{



	public static void main(String args []){
	
	
	
	
	
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter the size of the array : ");

		int size = sc.nextInt();

		char [] arr = new char [size];

		System.out.println("Enter the elements in the array :");

		for(int i=0 ; i<arr.length ; i++){
		
		
			arr[i] = sc.next().charAt(0);
		
		
		}

		System.out.println("Printing the elements in the array : ");


			for(int i = 0 ; i<arr.length ; i++){
			
			
				System.out.println(arr[i]);
			
			
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}




}
