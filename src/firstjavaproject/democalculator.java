package firstjavaproject;

import java.util.Scanner;

public class democalculator {

	public static void main(String[] args) {
		Scanner inputNum1 = new Scanner (System.in);
		Scanner inputNum2 = new Scanner (System.in);
		Scanner inputOpe = new Scanner (System.in);
		double num1, num2;
		String Ope;
		
		while (true) {
			System.out.print("Enter 1st number:");
			num1 = inputNum1.nextDouble(); 
			System.out.print("Enter 2nd number:");
			num2 = inputNum2.nextDouble();
			System.out.print("Enter Operator:");
			Ope = inputOpe.next();
			
				if (Ope.equals("+"))
					System.out.println(num1 + num2);
				else if (Ope.equals("-"))
					System.out.println(num1 - num2);
				else if (Ope.equals("*"))
					System.out.println(num1 * num2);
				else if (Ope.equals("/"))
					System.out.println(num1 / num2);			
			
		
		}
	}
}
