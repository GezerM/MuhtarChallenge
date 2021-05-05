package muhtarChallenge;

import java.util.Scanner;
public class MultipicationWithoutOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an intiger value greter than zero: ");
		int value1 = sc.nextInt();
		System.out.println("Please enter a second intiger value greter than zero: ");
		int value2 = sc.nextInt();
		sc.close();
		int total = 0;
		
		
		
		for (int i = 1; i <= value1; i++) {
			total +=value2;
		}
		
		System.out.println(value1 + " times " + value2 + " equals to " + total);
	}

}
