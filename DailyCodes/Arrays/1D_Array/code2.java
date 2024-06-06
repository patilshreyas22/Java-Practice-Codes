import java.io.*;

class code2{


	public static void main(String args [])throws IOException{
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please Enter the size of the Array : ");

		int size = Integer.parseInt(br.readLine());

		System.out.println("Size of the Array is " + size);
		
		int arr [] = new int [size];

		System.out.println("Please Enter Elements in the array : ");

		for(int i = 0 ; i<size ; i++){
		
		
			arr[i] = Integer.parseInt(br.readLine());
		
		
		}

		System.out.println("Displaying the data in the array : ");


		for(int i = 0 ; i<size ; i++){
		
			System.out.println(arr[i]);
		
		}
	
	
	
	}



}
