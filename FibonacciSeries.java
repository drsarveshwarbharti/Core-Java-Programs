/*Write a Java program to print the first n terms of the Fibonacci sequence.

The Fibonacci series is:

0,1,1,2,3,5,8,13,...

Each term after the first two is the sum of the two preceding terms.
*/

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        // Print first two terms
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Next term = sum of previous two
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
