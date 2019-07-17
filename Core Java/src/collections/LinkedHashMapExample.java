package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(789, "NewYork");
		lhm.put(456, "New Jerssy");
		lhm.put(123, "Atlanta");
		lhm.put(321, "San Fransico");
		lhm.put(987, "Syrcause");
		for (Map.Entry<Integer,String> map1 : lhm.entrySet() )
		{
			System.out.println(map1.getKey()+" "+map1.getValue());
		}
	}

}
