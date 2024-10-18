import java.util.*;
public class BeautifulMatrix{

	static int operations(int [][] matrix , int rows , int cols){
		
		int count=0;
			
		if(matrix[2][2] == 1){
		
			return 0;
		}else{
			
			for(int i = 0 ; i <rows ; i++){
			
				
				for(int j = 0 ; j <cols ; j++){
				
					
					if(matrix[i][j] == 1){
						
					        count = Math.abs(i-2) + Math.abs(j-2);
						matrix [i][j] = 0;
						matrix [2][2] = 1;
						return count;
					
					}
				
				
				}
			
			}
		
		
		
		}
	
		return count;
	}
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		int rows = 5;
		int cols = 5;

		int [][] matrix = new int [rows][cols] ;
		
		for(int i = 0 ; i<rows ; i++){

			for(int j = 0 ; j <cols ; j++ ){

			
				matrix[i][j] = sc.nextInt();
			}

		}

		System.out.println(operations(matrix , rows , cols));

}

}
