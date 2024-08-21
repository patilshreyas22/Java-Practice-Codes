 // this code tells you how the return statement works in java
 
class client{

	
	static int operations(int a , int b){
		
		// here it shows that , even if you have given a return value in the if - else section , you have to give a return value at the end of the method no matter what 
		// cause there will be other cases like a<0 or a==0 , what if those cases come up , or no case matches , and the code doesnt go into any if or else
		// so you need to return a value just in case or it throws a error of "Missing return statement"

		if(a>0){
			
			return a + b;
		
		}else if(a<0){
			
			return a -b;
		}else if(a==0){
			
			return a + b ;  //here i have covered every case for a but still it will throw a MISSING RETURN STATEMENT error
		
		}

		return a;		

			
	}

	public static void main(String args []){
		
		System.out.println(operations(5 , 4));
	
	}


}
