package Question1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Song s1=new Song("RRR", "FFF");
		
		Song s2=new Song("RRR", "ggg");
		
		Set<Song> songs = new HashSet<>();
		
		
		songs.add(s1);
		
		songs.add(s1);
		
		songs.add(s2);
		
		
		System.out.println(songs.size());
		
		
		
		s1.play();
		s2.play();

	}

}
