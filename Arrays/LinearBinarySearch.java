//Linear Search and Binary Search in one Java program so you can compare both approaches.

import java.util.Scanner;
import java.util.Arrays;

public class LinearBinarySearch {
    
    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index
            }
        }
        return -1; // not found
    }

    // Binary Search (array must be sorted)
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; // found
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Linear Search
        int linearIndex = linearSearch(arr, key);
        if (linearIndex != -1) {
            System.out.println("Linear Search: Element found at index " + linearIndex);
        } else {
            System.out.println("Linear Search: Element not found");
        }

        // Binary Search (array must be sorted)
        Arrays.sort(arr); // Sorting before binary search
        int binaryIndex = binarySearch(arr, key);
        if (binaryIndex != -1) {
            System.out.println("Binary Search (after sorting): Element found at index " + binaryIndex);
        } else {
            System.out.println("Binary Search: Element not found");
        }

        sc.close();
    }
}

/*
Example Run
Enter the number of elements: 6
Enter 6 elements:
20 5 15 10 25 30
Enter the element to search: 15

Linear Search: Element found at index 2
Binary Search (after sorting): Element found at index 2
*/
