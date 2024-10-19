import java.util.*;
import java.io.*;

public class WordCap{
	
	public static void main(String args []){
		

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		if((int)word.charAt(0) >= 97 && (int)word.charAt(0) <= 122){
		
			StringBuilder sb = new StringBuilder(word);

			int replacement = ((int)word.charAt(0)-32);

			sb.setCharAt(0 , (char)replacement);;

			System.out.println(sb);

		}else{
			
			System.out.println(word);
		
		}
	
	}

}
