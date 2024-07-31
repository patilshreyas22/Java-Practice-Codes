import java.util.*;

class HashSetDemo{

	public static void main(String args []){
	
	
		HashSet lang = new HashSet();

		lang.add("Cpp");              //when you add a string to the HASHSET , it calls the "PUT" method of the HASHMAP , --> hashMap.put("Cpp" , PRESENT) 
					                                                                                            // PRESENT here is the dummy object 
		lang.add("React");	      
	
		lang.add("Flutter");
						// Now the HashCode method of the String Class generated the hash code based on the characters of the string and their positions 
		lang.add("SpringBoot");		
						// The hash code is further sent to the "hash" method of the HashMap
		lang.add("Java");		
						// The putVal method returned by the Put method does the actual Insertion 
		lang.add("Python");
						// if the bucket is empty a new node is created and placed there , but if the bucket isnt empty then linked list or tree structure is used ,
						// but the bucket needs to be treeified for it , all this is done by the PutVal Method 

		lang.add("Swift");

		System.out.println(lang);

	}

}
