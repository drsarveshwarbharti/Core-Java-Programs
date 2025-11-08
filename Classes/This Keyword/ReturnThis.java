//Returning Current Object

class Demo {
    Demo getDemo() {
        return this;
    }

    void show() {
        System.out.println("Returned current object using this");
    }
}

public class ReturnThis {
    public static void main(String[] args) {
        new Demo().getDemo().show(); // method chaining
    }
}
