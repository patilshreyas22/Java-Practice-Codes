import java.util.*;

class code6{

	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Size : ");

			int size = sc.nextInt();

			char [] arr = new char [size];

			System.out.println("Add Elements : ");

			for(int i = 0 ; i<arr.length ; i++){
			
				arr[i] = sc.next().charAt(0);
			
			}

			System.out.println("Printing all the Consonants : ");

			for(int i = 0 ; i<arr.length ; i++){
			
			
				if(arr[i] == 'a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
				
				
				}
				else{
				
					System.out.println(arr[i]);
				}
			
			
			}
	
	
	
	}


}
