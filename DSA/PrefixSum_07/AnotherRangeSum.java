import java.util.*;

class demo{
	
	public static void main(String args []){
	
		
		Scanner sc = new Scanner(System.in);

		int arr [] = new int []{-3 , 6 , 2 , 4 , 5 , 2 , 8 , -9 , 3  , 1};

		int size = arr.length;

		int queries = 3;

	
			
			for(int j = 1 ; j<= queries ; j++){  //just realised that we cannot initiate nested for loops with same variables that is (int i) etc etc

			int start = sc.nextInt();

			int end = sc.nextInt();

			int sum = 0;
			
			if(start==end){
				
				System.out.println(arr[start]);
			}else{
				
				for(int i = start ; i<= end ; i++){
				
					
					sum += arr[i];
				
				}

				System.out.println(sum);
			
			}

		}
		
		
	
	}

}
