// Inheritance is the process that enables one class to acquire the properties (methods and variables) of another. With inheritance, the information is placed in a more manageable, hierarchical order.
// The class inheriting the properties of another is the subclass (also called derived class, or child class); the class whose properties are inherited is the superclass (base class, or parent class).
// To inherit from a class, use the extends keyword.
// When one class is inherited from another class, it inherits all of the superclass' non-private variables and methods.
// Recall the protected access modifier, which makes the members visible only to the subclasses.

// Constructors are not member methods, and so are not inherited by subclasses.
// However, the constructor of the superclass is called when the subclass is instantiated.
// class A {
//     public A() {
//         System.out.println("New A");
//     }
// }
// class B extends A {
//     public B() {
//         System.out.println("New B");
//     }
// }
// class Program {
//     public static void main(String[ ] args) {
//         B obj = new B();
//     }
// }
// will output New A New B

// You can access the superclass from the subclass using the super keyword.


// You are developing your own photo editing application.
// The standard free version allows you to draw and write text on a photo. The Pro subscription has 2 more features - the ability to use effects and the ability to change resolution.
// Complete/fix the given code to inherit Pro class from Standard class and successfully execute all the given method calls.

class Main {
    public static void main(String[] args) {
        Standard standard1 = new Standard();
        Pro pro1 = new Pro();
        standard1.draw();
        standard1.write();
        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.changeResolution();
    }
}

class Standard {
    protected void draw() {
        System.out.println("Drawing");
    }
    protected void write() {
        System.out.println("Writing");
    }
}

class Pro extends Standard {
    protected void useEffects() {
        System.out.println("Using Effects");
    }
    protected void changeResolution() {
        System.out.println("Changing Resolution");
    }
}