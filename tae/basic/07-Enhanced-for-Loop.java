// Your company is writing a program for a geometry course.
// The program takes the number of squares as the first input, creates an array, and then takes the sides of squares as its elements.
// Write the part of the program that receives a list of square sides and prints the area of those squares for the user.

import java.util.Scanner;

class EnhancedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides =  new int[length];
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt();
        }
        for (int side : sides) {
            System.out.println(side * side);
        }
    }
}