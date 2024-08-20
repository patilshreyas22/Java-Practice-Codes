import java.util.*;
class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
            int count = 0;
	    
	     
            if(arr1.length>arr2.length){
			
		    
	    		
		    for(int i = 0 ; i<arr2.length ; i++){
		    	
			    for(int j = 0 ; j<arr1.length ; j++){
			    	
				    if(arr2[i]==arr1[j]){
				    	count++;
				    }
			    
			    }
		    
		    }
	    }
	    else{

		
	    
	    	for(int i = 0 ; i<arr1.length ; i++){
			
			for(int j = 0 ; j<arr2.length ; j++){
				
				if(arr1[i]==arr2[j]){
					
					count++;
				
				}
			
			}
		
		}
	    
	    }

	    return arr1.length + arr2.length - count;
	    
        
    }
    
    public static void main(String args []){
        
            
        int arr1 [] = new int[]{85 , 25 , 1 , 32 , 54 , 6};
        
        int arr2 [] = new int[] {85 , 2};
        
        System.out.println(doUnion(arr1 , arr2));
        
        
    }
}
