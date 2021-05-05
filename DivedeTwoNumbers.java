package muhtarChallenge;

import java.util.Scanner;

public class DivedeTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an intiger value greter than zero to be devided: ");
		int value1 = sc.nextInt();
		System.out.println("Please enter a second intiger value greter than zero to devide: ");
		int value2 = sc.nextInt();
		sc.close();
		int result = 0;
		
		while (value1 >= value2) {
			result++;
			value1 -= value2;
		}
		System.out.println("The result is " + result + " with a remainder " + value1);

	}

}
