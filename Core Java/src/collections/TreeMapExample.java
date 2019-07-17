package collections;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(789, "NewYork");
		tm.put(456, "New Jerssy");
		tm.put(123, "Atlanta");
		tm.put(321, "San Fransico");
		tm.put(987, "Syrcause");
		for (Map.Entry<Integer,String> map1 : tm.entrySet() )
		{
			System.out.println(map1.getKey()+" "+map1.getValue());
		}
	}

	

}
