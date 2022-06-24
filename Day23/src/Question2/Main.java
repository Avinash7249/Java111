package Question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	
		
		public static void main(String args[])throws Exception{
			
			Address address=new Address("JK","solapur","12345");
			
			Student s1 =new Student(211,"ravi",address,"abc@gmail.com","3456");
			
			FileOutputStream file=new FileOutputStream("student.txt");
			
			ObjectOutputStream output=new ObjectOutputStream(file);
			
			output.writeObject(s1);
			
			output.flush();
			
			output.close();
			
			System.out.println("success");
			
			
			FileInputStream finputs=new FileInputStream("student.txt");
			
			ObjectInputStream oinputs=new ObjectInputStream(finputs);
			
			Object obj=oinputs.readObject();
			
			Student s=(Student)obj;
			
			System.out.println(s);
			
			oinputs.close();

	}

}

