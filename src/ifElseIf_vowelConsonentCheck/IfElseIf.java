package ifElseIf_vowelConsonentCheck;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Character ch;	
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Enter Your Character To check:");
	ch = inputScanner.next().charAt(0);
	
	/*if (ch=='a') {
		System.out.println("You Entered Vowel");
		
	}
	else if (ch =='e'){
		System.out.println("You Entered Vowel");
	}
	else if (ch=='i') {
		System.out.println("You Entered Vowel");
	}
	else if (ch=='o') {
		System.out.println("You Entered Vowel");
		
	}
	else if (ch=='u') {
		System.out.println("\"You Entered Vowel\"");
		
	}
	else {
		System.out.println("You entered consonent");
	}*/
	
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("It is vowel");
	}
		else {
			System.out.println("It is consonent");
		}
		
	}

	}


