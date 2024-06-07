import java.io.*;
class code4{



	public static void main(String args [])throws IOException{
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Please Enter the Jersy Numbers : ");

		int arr [] = new int [4];	
		for(int i = 0 ; i<4 ; i++){
		
		
			System.out.println("Enter Jersey No."+i);
			arr[i] = Integer.parseInt(br.readLine());
		
		}

		System.out.println("Jerseys are as folows : ");

		int k = 0;

		for(int i = 1 ; i<5 ; i++){
		
			System.out.println(arr[k]);
			k++;
		
		}
	
	
	
	
	
	}









}
