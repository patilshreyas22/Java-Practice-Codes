import java.util.*;

class ForEachDemo{

	
	public static void main(String args []){
	
		Stack<Integer> stack = new Stack<Integer>();

		for(int i = 10 ; i<=50 ; i+=10){
			
			stack.push(i);
		}

		stack.push("Shreyas");

		for(Integer x : stack){
			
			System.out.println(stack);
			
		}


	
	}

}
