//Java program demonstrating Exception Handling concepts, including
//try-catch,
//different exception types, and
//uncaught vs caught exceptions

// Program: ExceptionHandlingDemo.java
// Demonstrates fundamentals of exception handling in Java

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        System.out.println("Program started...");

        try {
            // 1️⃣ Arithmetic Exception (divide by zero)
            int a = 10, b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        try {
            // 2️⃣ ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range!");
        }

        try {
            // 3️⃣ NullPointerException
            String str = null;
            System.out.println(str.length());  // Accessing null object
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered!");
        }

        // 4️⃣ Checked Exception example (FileNotFoundException)
        // Uncomment below lines to test (requires import java.io.* and a file)
        /*
        try {
            FileReader file = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
        */

        System.out.println("Program completed successfully!");
    }
}

/*
OUTPUT:
Program started...
Error: Cannot divide by zero!
Error: Array index out of range!
Error: Null reference encountered!
Program completed successfully!
*/

/*Explanation
Exception Type	Example	Description
ArithmeticException	Divide by zero	Unchecked exception
ArrayIndexOutOfBoundsException	Invalid array index	Unchecked exception
NullPointerException	Null object access	Unchecked exception
FileNotFoundException	Missing file	Checked exception
*/

/*
Key Takeaways:
Each risky operation is placed inside a try block.
The corresponding catch block handles specific exceptions.
After handling, the program continues normally.
*/
You can include multiple catch blocks for different exception types.
