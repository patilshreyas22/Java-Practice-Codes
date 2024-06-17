import java.util.*;

class code5{

	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int [] arr = new int [size];

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		}
		
		int j = arr.length - 1;
		for(int i = 0 ; i<size/2; i++){
			
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j-=1;

		
		
		}

		System.out.println("Reversing the above array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			System.out.println(arr[i]);
		
		}

	
	
	}


}
