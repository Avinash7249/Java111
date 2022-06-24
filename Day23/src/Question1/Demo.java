package Question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:\\Ireshs\\abc.txt");
		
		List<String> list= Files.readAllLines(path);
		
		
		
		for(String line:list) {
			
		System.out.println(line);
		
		}
		}

}
