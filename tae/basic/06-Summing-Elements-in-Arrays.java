// You are given a program that takes the length of the array as the first input, creates it, and then takes the next inputs as elements of the array.
// Complete the program to go through the array and calculate the sum of the numbers that are multiples of 4.

import java.util.Scanner;

class SumElementsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array =  new int[length]; // we declare the array's length
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }
        System.out.print(sum);
    }
}