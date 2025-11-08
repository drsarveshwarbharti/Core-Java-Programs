//Implementing an Interface
//A class uses the implements keyword to provide implementation for interface methods.

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {  // must be public
        System.out.println("Dog barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a = new Dog();  // interface reference
        a.sound();
    }
}
/*
Output:
Dog barks
*/
