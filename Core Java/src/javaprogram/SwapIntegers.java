/**
 * 
 */
package javaprogram;

/**
 * @author alagappan.n
 *
 */
public class SwapIntegers {

	/**
	 * @param args
	 */
	// Swap the integers using third variable
	public static void main(String[] args) {
		
		int x = 76;
		int y = 89;
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
		
		// Swap the integers without third variable (Addition)
		
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
		
		// Swap the integers without third variable (Multiply)
		
		x=x*y;
		y= x/y;
		x= x/y;
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
		

		
		
		

	}

}
