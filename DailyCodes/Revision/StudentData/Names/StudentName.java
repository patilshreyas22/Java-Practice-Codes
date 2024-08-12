package StudentData.Names;
import java.io.*;
import java.util.*;

public class StudentName{

	public void register()throws IOException{
	
		FileWriter fobj = new FileWriter("SNames.txt" , true);

		BufferedWriter bobj = new BufferedWriter(fobj);

		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();

		bobj.write(name);

		bobj.close();

		fobj.close();
	
	
	}

}
