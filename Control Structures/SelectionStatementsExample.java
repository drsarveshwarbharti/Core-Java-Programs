//if, if-else, and if-else-if ladder in a single Java program using user input (via Scanner)

/* WAP in Java that checks whether entered number is positive or negative, even or odd 
and check student grades based on marks entered by the user using if, if-else, and if-else-if ladder respectively */

/* 
1. Checks if number entered by the user is positive or not
2. Checks whether entered number is even or odd
3. Checks student grades based on marks entered by the user
*/

import java.util.Scanner;

public class SelectionStatementsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. IF statement
        //Checks if number entered by the user is positive or not
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("IF Example: The number is positive.");
        }

        // 2. IF-ELSE statement
        //Checks whether entered number is even or odd
        if (number % 2 == 0) {
            System.out.println("IF-ELSE Example: The number is even.");
        } else {
            System.out.println("IF-ELSE Example: The number is odd.");
        }

        // 3. IF-ELSE-IF LADDER statement
        //Checks student grades based on marks entered by the user
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

/* OUTPUT:
Enter a number: 7
IF Example: The number is positive.
IF-ELSE Example: The number is odd.
Enter marks (0-100): 82
IF-ELSE-IF Example: Grade = A
*/
