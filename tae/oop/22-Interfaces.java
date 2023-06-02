// An interface is a completely abstract class that contains only abstract methods.
// Some specifications for interfaces:
// Defined using the interface keyword.
// May contain only static final variables.
// Cannot contain a constructor because interfaces cannot be instantiated.
// Interfaces can extend other interfaces.
// A class can implement any number of interfaces.

// Interfaces have the following properties:
// An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
// Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
// Methods in an interface are implicitly public.
// A class can inherit from just one superclass, but can implement multiple interfaces!

// Use the implements keyword to use an interface with your class.
// When you implement an interface, you need to override all of its methods.

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.swim();
        dog.play();
        cat.swim();
        cat.play();
    }
}

interface Swimmer {
    void swim();
}

interface Player {
    void play();
}

abstract class Animal implements Swimmer, Player {}

class Dog extends Animal {
    public void swim() {
        System.out.println("Dog is swimming");
    }
    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat extends Animal {
    public void swim() {
        System.out.println("Cat is swimming");
    }
    public void play() {
        System.out.println("Cat is playing");
    }
}