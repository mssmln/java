// When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects.
// The COUNT variable will be shared by all objects of that class.
// Now, we can create objects of our Counter class in main, and access the static variable.

class Static {
    public static void main(String[ ] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
        System.out.println(c1.COUNT);
        Vehicle.horn();
    }
}

class Counter {
    public static int COUNT=0;
    Counter() {
        COUNT++;
    }
}

// The output is 2, because the COUNT variable is static and gets incremented by one each time a new object of the Counter class is created. In the code above, we created 2 objects.
// You can also access the static variable using any object of that class, such as c1.COUNT.



// The same concept applies to static methods.
// Now, the horn method can be called without creating an object:

class Vehicle {
    public static void horn() {
        System.out.println("Beep");
    }
}

// Another example of static methods are those of the Math class, which is why you can call them without creating a Math object.
// Also, the main method must always be static.