package assignment6Anskey;
/*
 * Ex2: Write a Java program to print the ASCII Value of all uppercase alphabets A-Z. (Use do while loop)
 */

/*  
 * This class is written to demonstrate do While loop usage.
 */
public class Ex2DoWhileLoop {

	public static void main(String[] args) {
		// Initialize i with the ascii value of 'A'.
		int i = 65;

		do { 
			
			System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
			i++;
			
		}while(i >= 65 && i <= 90);

	}
}
