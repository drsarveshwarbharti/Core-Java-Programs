/*
Write a Java program to input a number n and calculate its factorial using Recursion.
    n!=n×(n−1)×(n−2)×...×1
    
How it Works:
    Base case:
        If n = 0 or n = 1, factorial = 1

    Recursive step:
        factorial(n) = n × factorial(n-1)
*/

import java.util.Scanner;

public class FactorialRecursion {

    // Recursive function to calculate factorial
    static long factorial(int n) {
        if (n == 0 || n == 1)  // Base case
            return 1;
        else
            return n * factorial(n - 1); // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Output
        System.out.println(n + "! = " + factorial(n));

        sc.close();
    }
}
/* Example Run:
Enter a number: 5
5! = 120
*/
