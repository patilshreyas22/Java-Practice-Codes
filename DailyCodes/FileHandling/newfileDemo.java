import java.io.*; // IO package consists of all the things required for file handling 

class Demo{

	public static void main(String args [])throws IOException{
	
		File obj1 = new File("Incubators.txt");  // this line basically is for the future reference , that is if this file ever exists then use it 
		
		obj1.createNewFile();   //the createnewfile line throws IOException 
	
		// This code here will create a new text file named as Incubators.txt
		
	
	}



}
