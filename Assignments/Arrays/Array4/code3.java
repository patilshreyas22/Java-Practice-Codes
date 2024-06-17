import java.util.*;

class code3{

	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int [] arr = new int [size];

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		}
		
		int max = arr[0];
		int max2 = arr[0];
		for(int i = 0 ; i<arr.length ; i++){
		
		
			if(arr[i] > max){
			
				max = arr[i];
			}
		
		}

		boolean max2found = false;
		for(int i = 0 ; i<arr.length ; i++){
		if(arr[i] != max){
		
			max2 = arr[i];
			max2found = true;
			break;
		}
		}

		for(int i = 0 ; i<arr.length ; i++){
		
			if(arr[i] > max2 && arr[i] < max){
			
				max2 = arr[i];
			}
		
		}

		System.out.println(max2);
	
	}


}
