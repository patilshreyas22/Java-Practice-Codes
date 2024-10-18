import java.util.*;
public class PetyaString{

	public static void main(String args []){
	
		
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();

		String str2 = sc.nextLine();

		String Lstr1 = str1.toLowerCase();

		String Lstr2 = str2.toLowerCase();

		int compareResult = Lstr1.compareTo(Lstr2);

		if(compareResult < 0){
			
			System.out.println(-1);
		}else if(compareResult > 0){
			
			System.out.println(1);

		}else{
			
			System.out.println(0);
		}
	
	}

}
