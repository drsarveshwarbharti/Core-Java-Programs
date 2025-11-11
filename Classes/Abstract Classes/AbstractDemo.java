// Abstract class
abstract class Shape {
    abstract void draw();  // Abstract method

    void display() {       // Concrete method
        System.out.println("This is a shape.");
    }
}

// Subclass implementing abstract method
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

// Driver class
public class AbstractDemo {
    public static void main(String[] args) {
        // Shape s = new Shape(); // ❌ Not allowed (cannot instantiate)
        Shape s = new Circle();   // ✅ Allowed (reference to subclass)
        s.display();
        s.draw();
    }
}
/*
Output:

This is a shape.
Drawing a Circle...
*/
