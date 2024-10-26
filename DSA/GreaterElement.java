//tc : O(N)

class demo{
	
	
	public static void main(String args []){
		
		int N = 10;
		int arr [] = new int [] {2 , 3 , 2 , 12 , 8, 12 , 8 , 1 , 7 , 8};
		
		int max = Integer.MIN_VALUE;

		int count = 0;

		for(int i = 1 ; i < arr.length ; i++){
			
			if(arr[i] > max){
			
				max = arr[i];
			}
			
		}

		for(int i = 0 ; i < arr.length ; i++){
		
			if(arr[i] == max){
				
				count++;
			}

		}

		System.out.println(arr.length-count);


		
		}
}
