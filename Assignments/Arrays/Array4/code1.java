import java.util.*;
class code1{


	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Size : ");

		int size = sc.nextInt();


		int arr [] = new int [size];

		System.out.println("Enter the elements in the array : ");
		
		float avg = 0 ;
		
		for(int i = 0 ; i<arr.length ; i++){
		
		
			arr[i] = sc.nextInt();
			avg += arr[i];
		}

		System.out.println("Average :" + (avg/arr.length));

		

		


	
		
	
	}






}
