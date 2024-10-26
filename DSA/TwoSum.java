import java.util.*;

class demo{
	
	public static void main(String args []){
	
	
		int arr [] = new int []{3 , 5 , 2 , 1 , -3 , 7 , 8 , 15 , 6 , 13};

		int N = arr.length;

		int K = 10;

		int count = 0;

		for(int i = 0 ; i<N ; i++){
			
			for(int j = 0 ; j<N ; j++){
			
				
				if(arr[i] + arr[j] == K && arr[i] != arr[j]){
					
					count++;
				
				}
			
			}
		
		
		}

		System.out.println(count);

	
	}

}
