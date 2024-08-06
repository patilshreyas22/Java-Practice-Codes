import java.util.*;

class Duplicate{

	
	public static void main(String args []){
		
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();

		int arr [] = new int [size];

		boolean hasDuplicate = false;

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = scanner.nextInt();


		}

		for(int i = 0 ; i<arr.length ; i++){
			
			int check = arr[i];

			for(int j = i ; j<arr.length-1 ; j++){
			if(check == arr[j+1]){
			
				System.out.println("element " + check + " has a duplicate element at index " + i );
				hasDuplicate = true;
				break;
			}
			else{
				
			
			
			}
			
		}

		if(hasDuplicate == true){
			
			break;
		
		}
		
	}
	
}

}
