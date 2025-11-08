//Calling Parent Constructor

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }
}

class Car extends Vehicle {
    Car() {
        super(); // Calls Vehicle class constructor
        System.out.println("Car constructor called");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Car c = new Car();
    }
}

/*
Output:
Vehicle constructor called
Car constructor called
*/
