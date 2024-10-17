import java.util.*;
public class DominoPiling{

	
	static int operations(int M , int N){
	
		int size = M * N;

		int DominoCount = size/2;

		return DominoCount;
	
	
	}




	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		sc = new Scanner(input);

		int M = sc.nextInt();

		int N = sc.nextInt();

		System.out.println(operations(M , N));
	
	}



}
