class demo{
	
	public static void main(String args []){
		
		int arr [] = new int []{1,2,3,4,5,6,7,8,9,10};

		int size = arr.length;

		int temp;

		for(int i = 0 ; i<size/2 ; i++){
			
			temp = arr[i];

			arr[i] = arr[size-i-1];

			arr[size-i-1] = temp;

		
		}

		for(int x : arr){
			
			System.out.println(x);
		
		}
	
	}

}
