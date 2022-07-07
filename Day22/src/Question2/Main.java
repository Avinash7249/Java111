package Question2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		FileReader fr1=new FileReader("xyz.txt");
		int i=fr1.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr1.read();
		}
		

	}
	
}


