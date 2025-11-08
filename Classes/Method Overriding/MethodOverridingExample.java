class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();   // Calls parent version

        Animal b = new Dog();
        b.sound();   // Calls overridden version (runtime polymorphism)
    }
}

/*
Output:
Animal makes a sound
Dog barks
*/
