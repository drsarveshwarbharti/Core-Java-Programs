//Java Input Using Scanner Class (Reading Different Data Types)

import java.util.Scanner;

public class ScannerInputExample {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read different types of input
      
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // reads a full line

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // reads integer

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble(); // reads double

        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        sc.close(); // always close the Scanner
    }
}
