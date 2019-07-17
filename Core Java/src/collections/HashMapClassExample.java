package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapClassExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1023, "City");
		map.put(1024, "Town");
		map.put(1025, "Village");
		map.put(1026, "Street");
		map.put(1026, "Street"); // Not keep duplicate key.
		
		map.remove(1026);
		for(Entry<Integer,String> mp : map.entrySet())
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
		//Another way to getting Map data
		
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("VM3100", "Alagappan");
		map2.put("VM3101", "Sabari");
		map2.put("VM3103", "Muthu");
		map2.put("VM3104", "Subbu");
		
		Set<Entry<String, String>> es = map2.entrySet();
		
		Iterator<Entry<String, String>> itr = es.iterator();	
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> me = (Map.Entry<String, String>)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		// HashMap with Class data type
		
		Map<Integer,Employee> map3 = new HashMap<Integer,Employee>();
		map3.put(001, new Employee(3400,"Arul", 50000));
		map3.put(002, new Employee(3401,"Bala", 60000));
		map3.put(003, new Employee(3402,"Kumar", 55000));
		
		for (Entry<Integer,Employee> mp2 : map3.entrySet())
		{
			Employee e = mp2.getValue();
			System.out.println(mp2.getKey()+" "+e.EmpolyeeID+" "+e.EmployeeName+" "+e.Salary);
		}
	}

}
