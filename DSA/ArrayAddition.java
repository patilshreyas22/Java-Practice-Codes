import java.util.*;
class demo{
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);


		int size = sc.nextInt();

		int arr [] = new int [size];

		for(int i = 0 ; i<size ; i++){
			
			arr[i] = sc.nextInt();
		
		}

		for(int i = 0 ; i<=size/2 ; i++){
		
			int j = size - i - 1;

			if(i==j){
				
				System.out.println(arr[i]);
			}else{
				
				System.out.println(arr[i] + arr[size - i - 1]);
			
			}

		
		}
		
	
	
	}

}
