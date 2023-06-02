// Polymorphism, which refers to the idea of "having many forms", occurs when there is a hierarchy of classes related to each other through inheritance.
// A call to a member method will cause a different implementation to be executed, depending on the type of the object invoking the method.

// Vehicles can be classified according to what energy source powers them. The program you are given has 3 vehicle classes: Vehicle, ElectricVehicle and HybridVehicle.
// ElectricVehicle and HybridVehicle classes are inherited from Vehicle class.
// Complete the program by reimplementing method resource() in inherited classes, so that the given calls work correctly.

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle electric = new ElectricVehicle();
        Vehicle hybrid = new HybridVehicle();
        vehicle.start();
        vehicle.resource();
        electric.start();
        electric.resource();
        hybrid.start();
        hybrid.resource();
    }
}

class Vehicle {
    protected void start() {
        System.out.println("Starting");
    }
    protected void resource() {
        System.out.println("I use petrol");
    }
}

class ElectricVehicle extends Vehicle {
    protected void resource() {
        System.out.println("I use electricity");
    }
}

class HybridVehicle extends Vehicle {
    protected void resource() {
        System.out.println("I use both petrol and electricity");
    }
}