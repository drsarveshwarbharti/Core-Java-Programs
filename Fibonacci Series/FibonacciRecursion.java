/*Write a Java program to print the first n terms of the Fibonacci sequence using Recursion.

The Fibonacci series is:
    0,1,1,2,3,5,8,13,...
Each term after the first two is the sum of the two preceding terms.
*/
import java.util.Scanner;

public class FibonacciRecursion {
    
    // Recursive function to return nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0)  // base case
            return 0;
        else if (n == 1)  // base case
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        // Print Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}

/*
Example Run:
Enter the number of terms: 7
Fibonacci Series up to 7 terms: 0 1 1 2 3 5 8
*/
