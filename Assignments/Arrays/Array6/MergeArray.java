import java.util.*;

class MergeArray{

	
	public static void main(String args []){
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of Array 1 : ");

		int size1 = scanner.nextInt();

		int arr1 [] = new int[size1];

		System.out.println("Enter elements into the Array : ");

		for(int i = 0 ; i<arr1.length ; i++){
		
			arr1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the size of Array 2 : ");

		int size2 = scanner.nextInt();

		int arr2 [] = new int[size2];

		System.out.println("Enter elements into the Array : ");

		for(int i = 0 ; i<arr2.length ; i++){
		
			arr2[i] = scanner.nextInt();
		}

		System.out.println("Merging the two Arrays : ");

		int arr3 [] = new int[size1+size2];

		for(int i = 0 ; i<arr1.length ; i++){
			
			arr3[i]=arr1[i];
			
		}
		int counter = 0;
		for(int i = size1 ; i<arr3.length ; i++){
		
			arr3[i]=arr2[counter];
			counter++;
		}

		System.out.println("Printing the Merged Array : ");

		for(int i = 0 ; i<arr3.length ; i++){
			
			System.out.println(arr3[i]);
		
		}
	
	}

}
