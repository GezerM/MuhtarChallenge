package muhtarChallenge;

import java.util.Scanner;

public class RoomReservation {

	public static void main(String[] args) {

		final double kingBed = 120;
		final double queenBed = 100;
		final double singleBed = 80;
		double total = 0;
		boolean outFlag = true;
		boolean inFlag = true;
		
		Scanner sc = new Scanner(System.in);
		String brChoise;
		
		System.out.println("King Bed ==> 120$\r\n"
				+ "Queen Bed ==> 100$\r\n"
				+ "Single Bed ==> 80$");

		do {
			System.out.println("Please enter your bedroom choise from the list: ");
			brChoise = sc.nextLine();
			
			
			if (brChoise.trim().equalsIgnoreCase("King Bed")) {
				total += kingBed;
			} else if (brChoise.trim().equalsIgnoreCase("Queen Bed")) {
				total += queenBed;
			}else if (brChoise.trim().equalsIgnoreCase("Single Bed")) {
				total += singleBed;
			} else {
				System.out.println("Invalid entry!");
			}
			do {
				System.out.println("Do you want to reserve another room?");
				System.out.println("Please enter 'Yes' to add more numbers or 'No' to quit:");
				String check = sc.next();
				System.out.println();
				
			
				if (check.trim().equalsIgnoreCase("no")) {
					outFlag = false;
					inFlag = false;
				} else if (check.trim().equalsIgnoreCase("yes")) {
					outFlag = true;
					inFlag = false;
				} else {
					System.out.println("Invalid entry! Please retry!");
					outFlag = true;
					inFlag = true;
				} 
			} while (inFlag);
				
			sc.nextLine(); // don't ask me why have this here. it just fixed something that you can try on your own!
		} while (outFlag);
		System.out.println("The total cost of your reservation is $" + total);
			
		sc.close();	

	}

}
