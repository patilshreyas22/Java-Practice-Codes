import java.util.*;

class code4{

	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int [] arr = new int [size];

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		}

		System.out.println("NUmber : ");

		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 0 ; i<arr.length ; i++){
		
		
			if(arr[i] == num){
				count++;
			
			}
		
		}

		if(count>2){
		
			System.out.println("more than 2 times");
		}
		
		else if (count == 2){
		
			System.out.println("exact 2 times");
		
		}
		else{
			System.out.println("less than 2 times");
		
		}

	
	
	}


}
