import java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
	
		FileWriter fobj = new FileWriter("NewFile.txt");

		BufferedWriter bobj = new BufferedWriter(fobj);

		bobj.write("I am writing using the BufferedWriter \n");

		bobj.write("If you give the same name of your class/java program as the name of the pre-defined class , then it shows the duplicate class name Error");

		fobj.close();  // as we are closing the stream and then performing an operation on (BufferedWriter) bobj.close , it will throw an IOException , the ensureOpen Method from the StreamEncoder class will throw the exception

		bobj.close();  //here the BufferedWriter tried to flush its buffer to the underlying FileWriter which has already been closed , so basically performing a operation on the stream which has already been closed , thats why ensureOpen Method throws an Exception
	
	
	
	}

}
