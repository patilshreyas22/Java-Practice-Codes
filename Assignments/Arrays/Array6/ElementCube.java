import java.util.*;

class Cube{

	
	public static void main(String args []){
	
		
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();

		int arr [] = new int [size];

		for(int i = 0 ; i<arr.length ; i++){
			
			arr[i] = scanner.nextInt();
		
		}

		System.out.println("Enter the element to be searched  : ");

		int check = scanner.nextInt();
		int count = 0;
		

		for(int i = 0 ; i<arr.length ; i++){
		
			if(check == arr[i]){
				
				count++;
			
			}
			else{
				
				
			
			}



		}

		if(count>2){
		
			for(int i = 0 ; i<arr.length ; i++){
			
				if(check == arr[i]){
					
					arr[i] = arr[i]*arr[i]*arr[i];
				
				}

			
			}
		
		}

		for(int i = 0 ; i <arr.length ; i++){
			
			System.out.println(arr[i]);
		
		}
	
	}


}
