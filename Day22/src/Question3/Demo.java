package Question3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	
	
	public static void readFiles(File f,String name) {
		
		File[] files= f.listFiles();
		
		for(File file:files) {
			if(file.isDirectory())
				readFiles(file, name);
			else
				if(file.getName().equals(name)) {
					
				};
			
		}
		
		
	}
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		File f1=new File("src/Question3/xyz.txt");
		f1.createNewFile();
//		System.out.println("Enter file name");
//		String name1= br.readLine();
//		
//		System.out.println("Enter letter");
//		String name= br.readLine();
//		
		File f= new File("C:\\Ireshs");
		
		String r = "abc.txt";
		readFiles(f,r);
		
		
		
	}
}



