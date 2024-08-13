import java.io.*;

class Client{

	public static void main(String args [])throws Exception{
	
		FileInputStream fis = new FileInputStream("Serialization.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee fileobj1 = (Employee)ois.readObject();
		

		System.out.println("Employee ID :" + fileobj1.empid);

		System.out.println("Employee Name : " + fileobj1.empName);
	
	
	}


}
