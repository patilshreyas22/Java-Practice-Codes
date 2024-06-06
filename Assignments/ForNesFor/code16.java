class code16{


	public static void main(String args []){
	
	
	
		int num = 1;
		char ch = 65;


		for(int i = 1; i<=9 ; i++ ){
			
			
			if(i%2==0){
			
				System.out.print(ch);


				if(i%3==0){
				
					System.out.println();
				
				}
			
			}
			else{
			
				System.out.print(num);

				if(i%3==0){
				
				
					System.out.println();
				
				}
			}
			

			ch++;
			num++;
		
		}	
	
	
	
	}





}
