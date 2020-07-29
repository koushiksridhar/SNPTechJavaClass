package assignment6Anskey;

import java.util.Scanner;
/*
 * Ex1: Write a java program to ask the user to enter only a number inside a while loop and print it.  
 * If the user enters other than number end the program. ( Use while loop).
 */

/*  
 * This class is written to demonstrate While loop usage.
 */
public class Ex1WhileLoop {

	public static void main(String[] args) {
		int num=0;
		
		//accepting input and printing input number
		Scanner myScanner= new Scanner(System.in);
		
		// Method1
		/*
		
		while (true) { 
			try {
				System.out.println("Enter Only a Number") ; 
				num=myScanner.nextInt();
				System.out.println("You have entered "+num); 
			} //output for when not number is inputed 
			catch ( Exception err ) { 
				System.out.println("out of loop" );
				break; 
			}
		}
		 
		*/
		// Method2
		/*
		System.out.println("Enter Only a Number") ;


		while(myScanner.hasNextInt()) {
			System.out.println("You have entered "+myScanner.nextDouble());
			System.out.println("Enter Only a Number");

		} 
		System.out.println("out of loop");
		*/
		
		// Method3
		
		/*
		while(true) {
		System.out.println("Enter Only a Number");
		String test=myScanner.next(); 
		System.out.println(test); 
		if(test.matches(".*\\d.*")) { 
			System.out.println("test has a number"); 
		}else {
			System.out.println("does not have number");
			break;
		}
		}
		*/
		// Method4
		
		while(true) {
			System.out.println("\nEnter Only a Number");
			boolean isNumber = true;
			String strtest=myScanner.next();

			for(char c: strtest.toCharArray()) {
				if(Character.isDigit(c)) {
					System.out.print(c);

				}else {
					System.out.println(" not a number");
					isNumber = false;
					break;
				}
			}
			if(isNumber == false) {
				break;
			}

		}
	
	}

}
