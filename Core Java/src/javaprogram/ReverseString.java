/**
 * 
 */
package javaprogram;

/**
 * @author alagappan.n
 *
 */
public class ReverseString {

	/**
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		
		
		//1.Using for loop
		String str = "Selenium Webdriver";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		//2. Using StringBuffer class
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
