//Simple Java program that demonstrates declaring, initializing, and using a 2D array
public class TwoDArrayExample {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2. Accessing Elements
        System.out.println("Element at [0][1]: " + matrix[0][1]); // 2

        // 3. Printing the 2D array using nested loops
        System.out.println("\n2D Array Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 4. Summing all elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("\nSum of all elements: " + sum);
    }
}

/* OUTPUT:
Element at [0][1]: 2

2D Array Elements:
1 2 3 
4 5 6 
7 8 9 

Sum of all elements: 45 */
