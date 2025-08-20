//Sum of an Array

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Display result
        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}
/*
OUTPUT

Enter the number of elements: 5
Enter 5 elements:
10 20 30 40 50
Sum of array elements = 150
*/
