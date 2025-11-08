//Accessing Parent Class Variables
class Parent {
    int value = 100;
}

class Child extends Parent {
    int value = 200;

    void show() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
/*
Output:

Child value: 200
Parent value: 100
*/
