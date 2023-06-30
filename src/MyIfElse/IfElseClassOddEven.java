package MyIfElse;

import java.util.Scanner;

public class IfElseClassOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int num;
		   Scanner myInput = new Scanner(System.in);
		   System.out.println("Enter Your number to Check Even Or Odd:");
		    num = myInput.nextInt();
		    
		    if (num%2==0) {
		    	System.out.println("Number is Even");
				
			}
   else {
	System.out.println("Number is Odd");
}
	}

}
