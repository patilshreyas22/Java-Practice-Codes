import java.util.*;
class arraybasic{
	
	static int operations(int arr [] , int search ){
		
		
		for(int i = 0 ; i<arr.length ; i++){
			
			if(search == arr[i]){
				return i;
			}
		
		}
		
		
		return -1;	
	}

	public static void main(String args []){
	
		
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr [] = new int [size];

		for(int i = 0 ; i<arr.length ; i++){
			
			arr[i] = sc.nextInt();
		
		}

		System.out.println("element to be searched : ");

		int search = sc.nextInt();

		int index = operations(arr , search);

		if(index==-1){
			
			System.out.println("No such element");
		}else{
			
			System.out.println(search + " is found at index no " + index);
		
		}

		
	
	}


}
