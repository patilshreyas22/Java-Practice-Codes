import java.io.*;

class code5{

	public static void main(String args [])throws IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
		System.out.println("Enter the size of the array : ");

		int size = Integer.parseInt(br.readLine());

		int arr [] = new int [size];
		
		System.out.println("Add Elements in the array : ");
		

		for(int i = 0 ; i<arr.length ; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		
		}


		System.out.println("Printing the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			System.out.println(arr[i]);
		
		}
	
	
	}




}
