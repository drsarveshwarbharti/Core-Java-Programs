//Extending Interfaces
//Interfaces can also extend other interfaces (just like classes), allowing interface inheritance.                                        
                                             
interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void accelerate();
}

class Honda implements Car {
    public void start() {
        System.out.println("Honda starting...");
    }

    public void accelerate() {
        System.out.println("Honda accelerating...");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.start();
        h.accelerate();
    }
}

/*
Output:
Honda starting...
Honda accelerating...
*/
