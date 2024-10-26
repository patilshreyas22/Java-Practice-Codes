import java.util.*;

class demo{
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr [] = new int [size];

		for(int i = 0 ; i<size ; i++){
			
			arr[i] = sc.nextInt();
		
		}

		int max = arr[0];
		int SecondLargest = 0;
		

		for(int i = 0 ; i < size ; i++){
			
			if(arr[i] > max){
				
				SecondLargest = max;
				max = arr[i];
				
			}
		
		}

		System.out.println("Second Largest Element : " + SecondLargest);
	
	}
}
