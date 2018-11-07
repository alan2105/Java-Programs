package arrays;

import java.util.HashSet;
import java.util.Iterator;

public class hasSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Hooters");
		hs.add("BWW");
		hs.add("Mellow Mushroom");
		hs.add("BWW Crop");
		hs.add("ABC Beer.co");
		System.out.println(hs);
		hs.remove("BWW");
		System.out.println(hs.size());
		System.out.println(hs.contains("Hooters"));
		System.out.println(hs);	
		System.out.println(hs.isEmpty());
		
		Iterator<String> t = hs.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());	
		}
		
	}

}
