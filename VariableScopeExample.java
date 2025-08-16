//Java program that demonstrates variable scope (local, instance, static, and block-level)

public class VariableScopeExample {

    // Instance variable (belongs to each object)
    int instanceVar = 10;

    // Static variable (shared among all objects of the class)
    static int staticVar = 20;

    public void methodScopeDemo() {
        // Local variable (exists only inside this method)
        int localVar = 30;
        System.out.println("Inside methodScopeDemo:");
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Local variable: " + localVar);

        // Block scope (variable exists only inside this block)
        if (localVar > 20) {
            int blockVar = 40; // block variable
            System.out.println("Block variable inside if: " + blockVar);
        }

        // Uncommenting below will cause error: blockVar cannot be resolved
        // System.out.println(blockVar);
    }

    public static void main(String[] args) {
        // Create object
        VariableScopeExample obj1 = new VariableScopeExample();
        VariableScopeExample obj2 = new VariableScopeExample();

        // Instance variable is unique for each object
        obj1.instanceVar = 50;
        obj2.instanceVar = 60;

        System.out.println("obj1.instanceVar = " + obj1.instanceVar); // 50
        System.out.println("obj2.instanceVar = " + obj2.instanceVar); // 60

        // Static variable is shared
        VariableScopeExample.staticVar = 100;
        System.out.println("obj1.staticVar = " + obj1.staticVar); // 100
        System.out.println("obj2.staticVar = " + obj2.staticVar); // 100

        // Call method to show local & block scope
        obj1.methodScopeDemo();
    }
}
