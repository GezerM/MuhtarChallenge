package muhtarChallenge;

import java.util.Scanner;

public class InfiniteAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter a second number: ");
		int num2 = sc.nextInt();
		int total, xNum;
		boolean flag = true;
		
		total = num1 + num2;
		
		do {
		System.out.println("Please enter 'Yes' to add more numbers or 'No' to quit :");
		String check = sc.next();
		
			if (check.trim().equalsIgnoreCase("no")) {
				flag = false;
			} else if (check.trim().equalsIgnoreCase("yes")) {
				System.out.println("Please enter a new number: ");
				xNum = sc.nextInt();
				total +=xNum;
			} else {
				System.out.println("Invalid entry!");
			}
		} while (flag);
		System.out.println("The sum of the numbers you have entered is " + total);
			
		sc.close();	
			
	}


}
