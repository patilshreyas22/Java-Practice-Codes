import java.io.*;

class Employee implements Serializable {

	int empID;
	String empName;

	Employee(int empID , String empName){
		
		this.empID = empID;
		this.empName = empName;
	
	}

}

class SerialDemo{

	public static void main(String args [])throws IOException{
	
		Employee emp = new Employee(101 , "Shreyas");	

		FileOutputStream fos = new FileOutputStream("EmployeeData.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(emp);

		System.out.println("Object has been written to the file");
	
	
	}

}

class Client{

	public static void main(String args [])throws Exception{
		
		FileInputStream fis = new FileInputStream("EmployeeData.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee fileobj1 = (Employee)ois.readObject();
		
		System.out.println("Object has been read from the file");
		System.out.println(fileobj1.empID);
		System.out.println(fileobj1.empName);

	
	
	}



}



