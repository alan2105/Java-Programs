/**
 * 
 */
package javaprogram;

/**
 * @author alagappan.n
 *
 */
public class RemoveJunk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "*&*@#*$#)@)((#@Selenium^#*(@())@*$&*&$^!%%$!&1234567890";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);

	}

}
