package muhtarChallenge;

import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string value: ");
		String value = sc.next();
		
		sc.close();
		char ch;
		int count;
		boolean flag;
		
		
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			count = 1;
			flag = true;
			for (int j = 0; j < i; j++) {
			
				if (value.charAt(j) == ch) {
					flag = false;
					break ;
				}   
			}
			while (flag) {
				for (int k = i + 1; k < value.length(); k++) {
					if (ch == value.charAt(k)) {
						count++;
					}
				}
				System.out.print(ch + "" + count);
				flag = false;
			}
		
		}
		
	}
		
}
