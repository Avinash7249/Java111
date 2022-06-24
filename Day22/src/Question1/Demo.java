package Question1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	
		public static void main(String[] args) throws IOException {
			
			File f=new File("C:\\Ireshs\\abc.txt");
			FileWriter fw = new FileWriter("C:\\Ireshs\\abc.txt");
			BufferedWriter bw1 = new BufferedWriter(fw);
			bw1.write(67);
			bw1.newLine(); 
			bw1.write("ram");
			bw1.newLine();
			bw1.write("india");
			bw1.newLine();
			char[] ch1={'a','b','c'};
			bw1.write(ch1);
			bw1.flush();
			bw1.close();
			System.out.println("done");
			
			FileReader fr=new FileReader("C:\\Ireshs\\abc.txt");
			
			BufferedReader br=new BufferedReader(fr);
			
			String line=br.readLine();
			
			while(line != null){
			System.out.println(line);
			line=br.readLine();
			}
			br.close();
			
			}
			

	}


