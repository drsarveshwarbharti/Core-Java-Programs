//if, if-else, and if-else-if ladder in a single Java program using user input (via Scanner)

import java.util.Scanner;

public class SelectionStatementsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. IF statement
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("IF Example: The number is positive.");
        }

        // 2. IF-ELSE statement
        if (number % 2 == 0) {
            System.out.println("IF-ELSE Example: The number is even.");
        } else {
            System.out.println("IF-ELSE Example: The number is odd.");
        }

        // 3. IF-ELSE-IF LADDER statement
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("IF-ELSE-IF Example: Grade = A+");
        } else if (marks >= 75) {
            System.out.println("IF-ELSE-IF Example: Grade = A");
        } else if (marks >= 60) {
            System.out.println("IF-ELSE-IF Example: Grade = B");
        } else if (marks >= 50) {
            System.out.println("IF-ELSE-IF Example: Grade = C");
        } else {
            System.out.println("IF-ELSE-IF Example: Fail");
        }

        sc.close();
    }
}
