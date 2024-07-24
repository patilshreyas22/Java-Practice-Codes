import java.io.*;

class Employee implements Serializable{ // Serializable Interface is a MARKER INTERFACE , it has not methods , as a result this class can be serialized

	int empid ;

	String empName;

	Employee(int empid , String empName){
	
		this.empid = empid;
		this.empName = empName;
	
	}

}

class SerialDemo{
	
	public static void main(String args [])throws IOException{
	
		
		Employee emp = new Employee(101 , "Pranita");

		FileOutputStream fos = new FileOutputStream("EmployeeData.txt"); //This Stream is connected to the file "EmployeeData.txt" where the object will be stored

		ObjectOutputStream oos = new ObjectOutputStream(fos); //This Stream is used to serialize the "Employee" object and write it to the "FileOutputStream"
								      
		oos.writeObject(emp); //This method Serializes the "Employee" object and write it to the "FileOutputStream"
		
	
	}

}

class DeserialDemo{

	public static void main(String args [])throws Exception{
	
		FileInputStream fis = new FileInputStream("EmployeeData.txt"); //This Stream will be connected to the file "EmployeeData.txt" from where the object will be read

		ObjectInputStream ois = new ObjectInputStream(fis); //This Stream is used to deserialize the "Employee" object read from the "FileInputStream"

		Employee fileobj1 = (Employee)ois.readObject(); //This method reads an object from the input stream and returns it as a generic "Object". It must me CAST to the "Employee" Type

		System.out.println(fileobj1.empid);
	
		System.out.println(fileobj1.empName);
	
	}

}
