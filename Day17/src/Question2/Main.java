package Question2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PlayList p=new PlayList();
		
		
		
        Song s1=new Song("RRR", "FFF");
		
		Song s2=new Song("Superman", "ggg");
		
        Song s3=new Song("Batman", "hhh");
		
		Song s4=new Song("Iron Man", "ttt"); 
		
		
		p.addSong(s1);
		p.addSong(s2);
		p.addSong(s1);
		
		List<Song> newsong=p.songs;
		for(Song s:newsong) {
			s.play();
		}
		
	}

}
