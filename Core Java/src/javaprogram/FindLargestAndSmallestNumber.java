/**
 * 
 */
package javaprogram;

import java.util.Arrays;

/**
 * @author alagappan.n
 *
 */
public class FindLargestAndSmallestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numbers []= {-50,-150,-2,1,25,79,32,456};
		
		int Largest = numbers[0];
		int Smallest= numbers[0];
		
		for(int i=1; i<numbers.length;i++)
		{
			if(numbers[i]>Largest) {
			Largest= numbers[i];
			}
			else if(numbers[i]<Smallest) {
				Smallest= numbers[i];		
			}
		}
		System.out.println("\n Given array is: "+Arrays.toString(numbers));
		System.out.println("Largest number is::" +Largest);
		System.out.println("Smallest number is::" +Smallest);

	}

}
