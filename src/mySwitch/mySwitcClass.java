package mySwitch;

import java.util.Scanner;

public class mySwitcClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		digit = inputScanner.nextInt();
		
		switch (digit) {
		case 0: 
			System.out.println("You Entered Zero");
			break;
		case 1:
			System.out.println("You Entered One");
		break;
		
	   case 2:
		    System.out.println("You Entered TWO");
		break;
	   case 3:
		    System.out.println("You Entered Three");
		break;
	 
	   default:
		
			System.out.println("You Entered Invalid");
			
			
		}
	
		
		

	}
	}


