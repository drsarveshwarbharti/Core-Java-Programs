
/*
What this program covers:
1. Break → Stops loop on negative input.
2. Continue → Skips even numbers when printing.
3. Return → Immediately exits from a method (findFirstEven, isPrime).
4. Mixed Example → Combines break, continue, and return.
*/

/*
Exercises on Jumping Statements (break, continue, return) for practice:

1. Break Statement Exercise
Write a Java program that asks the user to enter numbers continuously. Stop taking input when the user enters a negative number using the break statement.

2. Continue Statement Exercise
Write a Java program to print numbers from 1 to 20, but skip all even numbers using the continue statement.

3. Return Statement Exercise
Write a Java method findFirstEven(int[] arr) that returns the first even number from an array using the return statement. If no even number is found, return -1.

4. Mixed Exercise:
  Write a Java program to loop through numbers from 1 to 100:
  Stop the loop when the number is divisible by 11 (break).
  Skip printing numbers divisible by 5 (continue).
  Write a method isPrime(int n) that uses return to immediately return false if n is not prime.
*/

import java.util.Scanner;

public class JumpingStatementsExample {

    // Method using return
    public static boolean isPrime(int n) {
        if (n <= 1) return false;   // return immediately
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false; // not prime
        }
        return true; // prime
    }

    // Method using return to find first even number
    public static int findFirstEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                return num; // immediately return even number
            }
        }
        return -1; // if no even number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Break Example
        System.out.println("=== Break Example ===");
        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Negative number entered. Stopping...");
                break; // exit loop
            }
            System.out.println("You entered: " + num);
        }

        // 2. Continue Example
        System.out.println("\n=== Continue Example ===");
        System.out.println("Printing odd numbers between 1 and 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) continue; // skip even numbers
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Return Example
        System.out.println("\n=== Return Example (First Even in Array) ===");
        int[] arr = {3, 7, 9, 11, 14, 21};
        int firstEven = findFirstEven(arr);
        if (firstEven != -1) {
            System.out.println("First even number: " + firstEven);
        } else {
            System.out.println("No even number found.");
        }

        // 4. Mixed Example
        System.out.println("\n=== Mixed Example ===");
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) {
                System.out.println("Found a number divisible by 11: " + i);
                break; // stop loop
            }
            if (i % 5 == 0) continue; // skip multiples of 5
            System.out.print(i + " ");
        }
        System.out.println();

        // Check prime using return
        System.out.println("\nPrime Check:");
        int numCheck = 29;
        System.out.println(numCheck + " is prime? " + isPrime(numCheck));

        sc.close();
    }
}
