// Methods define behavior. A method is a collection of statements that are grouped together to perform an operation. System.out.println() is an example of a method.

import java.util.Scanner;

class Methods {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numberOfPeople = read.nextInt();
        for (int i = 0; i < numberOfPeople; i++) {
            welcome();
        }
    }
    public static void welcome() {
        System.out.println("Welcome!");
    }
}