//Calling Parent Class Method
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating...");
    }

    void show() {
        super.eat(); // Calls parent class method
        eat();       // Calls child class method
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}
