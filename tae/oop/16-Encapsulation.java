// There are 4 core concepts in OOP: encapsulation, inheritance, polymorphism, and abstraction.
// The idea behind encapsulation is to ensure that implementation details are not visible to users. The variables of one class will be hidden from the other classes, accessible only through the methods of the current class. This is called data hiding.
// To achieve encapsulation in Java, declare the class' variables as private and provide public setter and getter methods to modify and view the variables' values.

// In summary, encapsulation provides the following benefits:
// Control of the way data is accessed or modified
// More flexible and easily changed code
// Ability to change one part of the code without affecting other parts

// You need a program to manage admissions for an art school. Pupils can be admitted to the school if they are over 6 years of age.
// You're given a program which declares a Pupil class.
// Complete the setAge method of the Pupil class. If the value of parameter a is over 6, assign it to age attribute and output "Welcome".
// Output "Sorry" otherwise.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    int a = read.nextInt();
	    Pupil pupil =  new Pupil();
        pupil.setAge(a);
        System.out.print(pupil.getAge());
	}
}

class Pupil {
    private int age;
    public void setAge(int a) {
        if (a > 6) {
            this.age = a;
            System.out.println("Welcome");
        }
        else {
            System.out.println("Sorry");
        }
    }
    public int getAge() {
        return age;
    }
}