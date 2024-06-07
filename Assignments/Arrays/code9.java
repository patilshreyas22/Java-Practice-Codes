import java.util.*;

class code9{


	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the size of the Array : ");
		
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Initialized Array of size " + size);

		System.out.println("Enter " + size +  " elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}

		System.out.println("Printing the odd elements from the array : ");

		for(int j = 0 ; j<arr.length ; j++){
		
			if(j%2==0){
			
			
			}
			else{
			
				System.out.println(arr[j]);
			
			}
		
		}
	
	
	
	
	
	}






}
