// You need a program to convert days to seconds.
// The given code takes the amount of days as input. Complete the code to convert it to seconds and output the result.

import java.util.Scanner;

class TimeConverter {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		System.out.print(((days * 24) * 60) * 60);
	}
}