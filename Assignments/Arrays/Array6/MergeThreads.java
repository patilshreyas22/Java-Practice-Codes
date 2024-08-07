import java.util.*;

class MergeArray extends Thread{
	
	int [] arr1;
	int [] arr3;

	public MergeArray(int [] arr1 , int [] arr3){
	
		this.arr1 = arr1;
		this.arr3 = arr3;
	
	}

	public void run(){
	
		for(int i=0 ; i<arr1.length ; i++){
		
			arr3[i] = arr1[i];
		}
		
	
	}


}

class Client{

	public static void main(String args []){
	
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of Array 1 : ");

		int size1 = scanner.nextInt();

		int [] arr1 = new int[size1];

		System.out.println("Enter elements in Array 1 : ");

		for(int i = 0 ; i<arr1.length ; i++){
		
			arr1[i] = scanner.nextInt();
		
		}
		
		System.out.println("Enter the size of Array 2 : ");

		int size2 = scanner.nextInt();

		int [] arr2 = new int[size2];

		System.out.println("Enter elements in Array 2 : ");

		for(int i = 0 ; i<arr2.length ; i++){
		
			arr2[i] = scanner.nextInt();
		
		}

		int [] arr3 = new int[size1 + size2];

		MergeArray obj = new MergeArray(arr1 , arr3);

		obj.start();

		int counter = 0;
		for(int i = size1 ; i<arr3.length ; i++){
		
			arr3[i] = arr2[counter];
			counter++;
		}

		try{
			Thread.sleep(200);
			
		}catch(InterruptedException ie){
			
			System.out.println("Thread Sleep Exception");
		
		}

		System.out.println("This is the Merged Array : ");

		
		System.out.println(Arrays.toString(arr3));
		
		
	
	}

}
