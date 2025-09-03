/*Write a Java program to input a number n and calculate the sum of the first n natural numbers:
    
    Sum=1+2+3+...+n
    
*/
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        // Using for loop
        for (int i = 1; i <= n; i++) {
            sum += i;  // sum = sum + i
        }

        // Output
        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}

/* Example Run:
Enter a number: 5
Sum of first 5 natural numbers = 15
*/
