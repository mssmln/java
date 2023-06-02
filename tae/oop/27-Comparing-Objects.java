// Remember that when you create objects, the variables store references to the objects.
// So, when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.

class MyClass {
    public static void main(String[ ] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2);
    }
}

class Animal {
    String name;
    Animal(String n) {
        name = n;
    }
}