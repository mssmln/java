// You are the administrator of a hotel and must create customer information cards for your new customers. On the card, you must note the customer’s first and last name, age, and room number.
// The program you are given takes a guest's data (first name, last name, age, and room number) as input.
// Complete the class by adding corresponding attributes so that the saveCustomerInfo() method works correctly. Also assign taken data values to attributes of created object.

import java.util.Scanner;

class ClassAttributes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;
        customer.saveCustomerInfo();
    }
}

class Customer {
    String firstName;
    String secondName;
    int age;
    int roomNumber;
    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}