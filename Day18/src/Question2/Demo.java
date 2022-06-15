package Question2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> sname=new LinkedHashMap<>();
		
		sname.put("Maharashtra", "Mumbai");
		sname.put("Gova", "panji");
		sname.put("Up", "Bhopal");
		sname.put("Hariyana", "chandigadh");
		sname.put("sikkim", "gangtok");
		
		for(Map.Entry<String, String> m:sname.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			}

	}

}
