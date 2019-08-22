/**
 * 
 */
package javaprogram;

import java.util.HashSet;
import java.util.Set;

/**
 * @author alagappan.n
 *
 */
public class FindDulipatcateInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a[] = {"Java","Python","C#","Ruby","DotNet","C++","C#","Rails","Rails"};
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					System.out.println(a[i]);
				}
			}
			
		}
		System.out.println("----------------------------");
		Set<String> names = new HashSet<String>();
		for(String name:a)
		{
			if(names.add(name) == false)
			{
				System.out.println(name);
			}
		}

	}

}
