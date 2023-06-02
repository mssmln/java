// When methods have the same name, but different parameters, it is known as method overloading.
// This can be very useful when you need the same method functionality for different types of parameters.
// An overloaded method must have a different argument list; the parameters should differ in their type, number, or both.
// Another name for method overloading is compile-time polymorphism.

// Complete and overload the doubleTheValue() method to calculate the double the value of the a and b variables.

class Main {
    public static void main(String[] args) {
        int a = 5;
        double b = 10.2;
        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));
    }
    public static int doubleTheValue(int num) {
        return num * 2;
    }
    public static double doubleTheValue(double num) {
        return num * 2;
    }
}