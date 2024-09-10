import java.util.*;
class solution{
	
	static int [] operations(int arr []){
			
			

		for(int i = 0 ; i<(arr.length)/2 ; i++){
			
			int temp = arr [i];

			arr[i]=arr[arr.length-i-1];

			arr[arr.length-i-1] = temp;
			

		}

		for(int i = 0 ; i<arr.length ; i++){
			
			System.out.println(arr[i]);
		
		}
		return arr;

		
	}

	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
			
		int arr [] = new int [size];

		for(int i = 0 ; i < arr.length ; i++){
				
			arr[i] = sc.nextInt();
		
		}

		operations(arr);
	
	}


}
