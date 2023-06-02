// Getters and Setters are used to effectively protect your data, particularly when creating classes. For each variable, the get method returns its value, while the set method sets the value.

// The program you are given receives name and age of student as input.
// Complete the program to set the values for the corresponding attributes of the Student class and prints out the final result. If the age is <0, program should output "Invalid age" and assign a 0 value to the age attribute.

import java.util.Scanner;

class GetterAndSetter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        student.setAge(age);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}

class Student {
    public String name;
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.print("Invalid age");
            age = 0;
        }
        this.age = age;
    }
}