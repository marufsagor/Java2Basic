package smallLetterCapitalLetter;

import java.util.Scanner;

public class SmallLetterCapitalLetterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter a letter:");
		ch =inputScanner.next().charAt(0);
		
		if (ch >='a' && ch<='z') {
			System.out.println("You Entered small letter");
			
		}
		else if (ch>='A' && ch<='z'){
			System.out.println("You Entered Capital");
			
		}
		else {
			System.out.println("Invalid Input");
		}
		

	}

}
