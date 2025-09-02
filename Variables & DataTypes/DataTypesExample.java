public class DataTypesExample {
    public static void main(String[] args) {
        // 1. Primitive Data Types
        byte b = 100;               // 8-bit integer
        short s = 10000;            // 16-bit integer
        int i = 100000;             // 32-bit integer
        long l = 10000000000L;      // 64-bit integer
        float f = 10.5f;            // 32-bit floating-point
        double d = 99.99;           // 64-bit floating-point
        char c = 'A';               // 16-bit Unicode character
        boolean flag = true;        // true/false

        // Printing primitive types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        // 2. Reference Data Types
        String str = "Hello, Java!";  // String (class object)
        int[] arr = {1, 2, 3, 4, 5}; // Array

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + str);

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
