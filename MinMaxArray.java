//Find the maximum and minimum elements in an array

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, -5, 78, 34, 0, -20};

        int max = arr[0];
        int min = arr[0];

        // Traverse array to find min & max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

/* 
Sample Output

For the array {10, 25, -5, 78, 34, 0, -20}:

Maximum element: 78
Minimum element: -20
  */
