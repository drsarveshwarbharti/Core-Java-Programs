//Applying Multiple Interfaces
//A class can implement multiple interfaces (unlike classes, which allow only single inheritance).

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}

/*
Output:
Method A
Method B
*/
