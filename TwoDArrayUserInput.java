//Java program where the user enters a 2D array from keyboard input using Scanner
import java.util.Scanner;

public class TwoDArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare 2D array
        int[][] matrix = new int[rows][cols];

        // Input elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate sum of all elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        
        /*
        //
        int sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            sum += matrix[i][j];
            }
        }
        */

        
        System.out.println("\nSum of all elements: " + sum);

        sc.close();
    }
}
