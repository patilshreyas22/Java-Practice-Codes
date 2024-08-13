import java.io.*;

class Demo{

	
	public static void main(String args [])throws IOException{
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int arr [] = new int[size];

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		
		}

		for(int i = 0 ; i<arr.length ; i++){
		
			System.out.println(arr[i]);
		}
	
	}

}
