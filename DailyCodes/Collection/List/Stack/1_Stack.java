import java.util.*;

class StackMethods{

	
	public static void main(String args []){
	
		
		Stack<Integer> stack = new Stack<Integer>();

		for(int i=10 ; i<=100 ; i+=10){
			
			stack.push(i);
		}

		System.out.println("Stack after push : " + stack);

		System.out.println("Popped Element : " + stack.pop()); //THIS WILL REMOVE THE TOP ELEMENT FROM THE STACK , IN THIS CASE '100'

		System.out.println("Peeking the element from stack using peek() : " + stack.peek());

		System.out.println("Is the stack empty? : " + stack.empty());

		System.out.println("Position of 30 : " + stack.search(30));

		System.out.println("Postion of 25 (not present in the stack ) : " + stack.search(25));

		for(int i = 10 ; i<=100 ; i+=10){
			
			System.out.println("The position of " + i + " in the Stack is " + stack.search(i));
		
		}
	}

}
