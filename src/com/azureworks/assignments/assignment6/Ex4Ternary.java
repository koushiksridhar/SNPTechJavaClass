package assignment6Anskey;

import java.util.Scanner;

/*
 * Ex4: Write a Java program to allow the user to input his/her age. 
 * Then the program will show if the person is eligible to vote. 
 * A person who is eligible to vote must be older than or equal to 18 years old.(Use ternary operator)
 *
 */
public class Ex4Ternary {

	public static void main(String[] args) {
		int num1=0;

		//Prompt the user to enter the Age.
		Scanner scanObj= new Scanner(System.in);
		System.out.println("Enter your age:") ;
		num1=scanObj.nextInt();

		//determine if input age is eligible to vote. 
		String x=(num1>=18)?"You are eligible to vote!":"Sorry, you can't vote yet.";
		System.out.println(x);

	}

}
