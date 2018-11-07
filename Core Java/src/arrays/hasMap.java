package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class hasMap {

	public static void main(String[] args) {
		
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Bud Light");
		hm.put(8, "Miler Light");
		hm.put(7, "Coors Light");
		hm.put(18, "Corana Light");
		System.out.println(hm.get(18));
		Set st = hm.entrySet();
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
		
		

	}

}
