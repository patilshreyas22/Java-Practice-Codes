//tc : O(N^2) NOT EXACTLY N^2 BUT AROUND IT

import java.util.*;

class BruteForceGreaterElement{
	
	public static void main(String args []){
	
		
		int arr [] = new int []{2 , 5 , 1 , 4 , 8 , 0 , 8 , 1 , 3 , 8};

		int size = arr.length;

		int count = 0;

		for(int i = 0 ; i<size ; i++){
			
			for(int j = 0 ; j < size ; j++){
				
				if(arr[i]<arr[j]){
					
					count++;
					break;
				}
				
			
			}
		
		}

		System.out.println(count);


	
	}

}
