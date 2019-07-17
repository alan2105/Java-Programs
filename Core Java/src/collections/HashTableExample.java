package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(789, "NewYork");
		ht.put(456, "New Jerssy");
		ht.put(123, "Atlanta");
		ht.put(321, "San Fransico");
		ht.put(987, "Syrcause");
		//ht.put(null, "TYest");
		ht.put(321, "San Fransico");
		for (Map.Entry<Integer,String> map1 : ht.entrySet() )
		{
			System.out.println(map1.getKey()+" "+map1.getValue());
		}
	}

}
