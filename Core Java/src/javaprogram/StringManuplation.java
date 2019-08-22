/**
 * 
 */
package javaprogram;

/**
 * @author alagappan.n
 *
 */
public class StringManuplation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
String S1 = "Selenium is the automation tool for web app";
String S2 = "Selenium is the Automation tool for web app";

System.out.println(S1.length());
System.out.println(S1.charAt(10));
System.out.println(S1.indexOf("t")); // 1st occurrence of letter
System.out.println(S1.indexOf("t", S1.indexOf("t")+1)); // 2nd occurrence of letter 't'
System.out.println(S1.indexOf("automation"));

//String Comparison

System.out.println(S1.equals(S2));

System.out.println(S1.equalsIgnoreCase(S2));

//SubString

System.out.println(S1.substring(0, 15));

//Trim

String str="   Hello Appium world   ";
System.out.println(str.trim());

//Replace

String date = "21/05/1991";
System.out.println(date.replace("/", "-"));

//Split

String test="String manuplation example program";
String test1[]= test.split(" ");
for( int i=0;i<test1.length;i++)
{
	System.out.println(test1[i]);
}

//String Concatenation

String str2 = "Web";
System.out.println(str2.concat(" Application"));

//Concatenation with integers and strings

	String a="Selenium", b= " Webdriver ";
	int x= 5, y=10;
	System.out.println(a+b);
	
	System.out.println(a+b+x+y);
	
	System.out.println(a+b+(x+y));
	
	System.out.println(x+y+a+b);
	
	System.out.println(x+a+y+b);
	
	System.out.println(a+x+b+y);
	}
}
