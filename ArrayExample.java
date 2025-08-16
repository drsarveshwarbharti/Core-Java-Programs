public class ArrayExample {
    public static void main(String[] args) {
        // 1. Single Dimensional Array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("1D Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Sum of array elements
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum of elements: " + sum);

        // 2. Multi-Dimensional Array (Matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 3. Finding maximum element
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("\nMaximum element in 1D array: " + max);

        // 4. Copying array
        int[] copy = new int[numbers.length];
        System.arraycopy(numbers, 0, copy, 0, numbers.length);

        System.out.println("\nCopied Array Elements:");
        for (int c : copy) {
            System.out.print(c + " ");
        }
    }
}
