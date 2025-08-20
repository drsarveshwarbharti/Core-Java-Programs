//Extended version of the MinMaxArray1.java program where the user enters the array size and elements using Scanner
//Finding minimum and maximum element of an Array

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        // Find maximum and minimum
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Output results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
      
      //=============Find maximum and minimum with INDEX================
      /*
      int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i; //index
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i; //index
            }
        }

        // Output results
        System.out.println("Maximum element: " + max + " at index " + maxIndex);
        System.out.println("Minimum element: " + min + " at index " + minIndex);
      */
      //===============================================================

        sc.close();
    }
}

/*
Example Run
Enter the number of elements in the array: 5
Enter 5 elements:
12 -4 56 0 9
Maximum element: 56
Minimum element: -4
*/

