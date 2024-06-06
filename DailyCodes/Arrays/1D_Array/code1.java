import java.util.*;
class code1{

	public static void main(String args []){
	
		
		System.out.print("Enter the size of the Array : ");

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Elements in Array : ");

		for(int i = 0 ; i<size ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}

		System.out.println("Printing the Data in Array : ");

		for(int i = 0 ; i<size ; i++){
		
			System.out.println(arr[i]);
		
		
		}


	
	
	}




}
