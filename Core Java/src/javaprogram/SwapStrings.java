/**
 * 
 */
package javaprogram;

/**
 * @author alagappan.n
 *
 */
public class SwapStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a= "Selenium";
		String b = "Java";
		
		//Swap the strings using third variable
		String c;
		c=a;
		a=b;
		b=c;
		System.out.println( "A value is: " +a);
		System.out.println( "B value is: " +b);
		
		//Swap the strings using without third variable
		
		//Append a and b
		a=a+b;
		// Store initial string a in string b
		b= a.substring(0,a.length()-b.length());
		//Store initial string b in string a
		a= a.substring(b.length());
		
		System.out.println( "A value is: " +a);
		System.out.println( "B value is: " +b);
		
		
	}

}
