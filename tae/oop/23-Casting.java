// Assigning a value of one type to a variable of another type is known as Type Casting.
// To cast a value to a specific type, place the type in parentheses and position it in front of the value.
// Java supports automatic type casting of integers to floating points, since there is no loss of precision.
// On the other hand, type casting is mandatory when assigning floating point values to integer variables.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char a = read.next().charAt(0);
        System.out.println((int) a);
    }   
}