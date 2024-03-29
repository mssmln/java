// You need to make a program to convert integer numbers to their binary representation.
// Create a Converter class with a static toBinary() method, which returns the binary version of its argument.
// The code in main takes a number as input and calls the corresponding static method. Make sure the code works as expected.

import java.util.Scanner;

class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}

class Converter {
    public static String toBinary(int num) {
        String binary = "";
        while(num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
            System.out.println(num);
        }
        return binary;
    }
}