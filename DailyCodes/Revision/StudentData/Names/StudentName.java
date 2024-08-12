package StudentData.Names;
import java.io.*;
import java.util.*;

public class StudentName{

	public void register()throws IOException{
	
		FileWriter fobj = new FileWriter("SNames.txt" , true);

		BufferedWriter bobj = new BufferedWriter(fobj);

		Scanner sc = new Scanner(System.in);

		System.out.print("                   Enter Your Name : ");

		String name = sc.nextLine();

		System.out.print("                   Enter Your PRN Number : ");

		String prn = sc.nextLine();

		System.out.print("                   Enter the College Name: ");

		String clgName = sc.nextLine();

		System.out.print("                   Enter Your Branch : ");

		String branch = sc.nextLine();

		bobj.write(name);
		bobj.write(clgName);
		bobj.write(prn);
		bobj.write(branch);


		bobj.close();

		fobj.close();
	
	
	}

}
