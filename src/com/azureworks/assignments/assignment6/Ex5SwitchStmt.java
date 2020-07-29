package assignment6Anskey;

import java.util.Scanner;
/*
 *  Ex5:Write a Java program to read the grade you scored. Then display the grade range using the following rules.
 *  (Use switch statement)
 *  -if the grade is “A”, "Congratulations! Your score is in the   range  90 -100”
 *  -if the grade is “B”, "Your score is in the range 70 - 89"
 *  -if the grade is “C”, "Your score is in the range 50 - 69"
 *  -if the grade is “D”, "Your score is in the range 35 - 49"
 *  -if the grade is “F”, “Sorry. Your score is not enough. Work hard”
 *  -if the grade is other than “A”, “B”, “C”, “D” and “F”, “The grade you entered is invalid”
 *  
 */
public class Ex5SwitchStmt {
	public static void main(String[] args) {

		String grade;

		//Prompt the user to enter the grade.

		Scanner scanObj= new Scanner(System.in);
		System.out.println("Enter the grade you scored: ") ;
		grade=scanObj.next();

		//Displaying the grade range using switch statement

		switch(grade){

		case "A": 
			System.out.println("Congratulations! Your score is in the range 90 -100");
			break;
		case "B":
			System.out.println("Your score is in the range 70 - 89");
			break;
		case "C":
			System.out.println("Your score is in the range 50 - 69");
			break;
		case "D":
			System.out.println("Your score is in the range 35 - 49");
			break;
		case "F":
			System.out.println("Sorry. Your score is not enough. Work hard");
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}

	}

}
