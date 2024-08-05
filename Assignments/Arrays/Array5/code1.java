import java.util.*;

class AscendingOrder{

	
	public static void main(String args []){
	
	
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();

		int arr [] = new int [size];

		boolean DoesFollow = false;

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = scanner.nextInt();
		
		}

		System.out.println("Checking if the Array is in Ascending Order : ");

		for(int i = 0 ; i<arr.length-1 ; i++){

		
			if(arr[i] < arr[i+1]){
					
				
				DoesFollow = true;
				
			}
			else{
			
				System.out.println("The array is not in the ascending order");
				DoesFollow = false;
				break;
			}
			
			
		}

		if(DoesFollow==true){
			
			System.out.println("The Array is in the Ascending Order");
		
		}

	
	
	}

}
