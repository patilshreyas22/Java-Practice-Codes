import java.io.*;
import java.util.*;

public class tooLong{
	


		public static void main(String args []){
		

		
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		sc.nextLine(); //consumes the nextLine which wasnt consumed by the sc.nextInt call

		StringBuilder [] SBarray = new StringBuilder[count];

		for(int i = 0 ; i<count ; i++ ){
			
			String word = sc.nextLine();

			StringBuilder sbword = new StringBuilder(word);

			if(sbword.length()>10){
				
				sbword.replace(1 , sbword.length()-1 , sbword.length()-2+"");

				SBarray[i]=sbword;
			
			}else{
				
				SBarray[i]=sbword;
			
			}
		
		
		}

		for(int i = 0 ; i<count ; i++ ){
			
			System.out.println(SBarray[i]);
		
		}

					
	}


}
