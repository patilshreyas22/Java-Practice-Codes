import java.io.*;
class DeDemo{
	
	public static void main(String args [])throws Exception{
	
	
		FileInputStream fis = new FileInputStream("Demo.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee fileobj1 = (Employee)ois.readObject();

		Employee fileobj2 = (Employee)ois.readObject();

		System.out.println(fileobj1.empid);
	
		System.out.println(fileobj2.empid);
	
		System.out.println(fileobj1.empname);
	
		System.out.println(fileobj2.empname);

	}

}
