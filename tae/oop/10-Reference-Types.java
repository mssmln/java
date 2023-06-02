// A reference type stores a reference (or address) to the memory location where the corresponding data is stored.
// When you create an object using the constructor, you create a reference variable.

// The method celebrateBirthday takes a Person object as its parameter, and increments its attribute.
// Because j is a reference type, the method affects the object itself, and is able to change the actual value of its attribute.
// Arrays and Strings are also reference data types.

class ReferenceTypes {
    public static void main(String[ ] args) {
        Person j;
        j = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
    }
    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
}

class Person {
    private String name;
    private int age;
    Person (String n) {
        this.name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a;
    }
}