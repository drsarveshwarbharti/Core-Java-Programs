/* Write a Java program to input a number n and calculate its factorial using For Loop.
  
n!=n×(n−1)×(n−2)×...×1

*/

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1; // use long to handle large numbers

        // Using for loop
        for (int i = 1; i <= n; i++) {
            factorial *= i; // factorial = factorial * i
        }

        // Output
        System.out.println(n + "! = " + factorial);

        sc.close();
    }
}
/* Example Run:
Enter a number: 5
5! = 120
*/
