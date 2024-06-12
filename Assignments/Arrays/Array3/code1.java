import java.io.*;

class code1{



	public static void main(String args [])throws IOException{
	
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of the Array :");

		int size = Integer.parseInt(br.readLine());	
	
		int [] arr = new int [size];

		System.out.println("Enter the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = Integer.parseInt(br.readLine());
			arr[i] += 15;
		
		}

		System.out.println("Adding 15 in every element of the array");

		for(int i = 0 ; i<arr.length ; i++){
		
		
			System.out.println(arr[i]);
		
		}

		
	
	
	
	}









}
