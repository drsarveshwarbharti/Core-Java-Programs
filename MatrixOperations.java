//Matrix Operations using 2D Array 

/* What this program does:
Takes two 3×3 matrices as input.
Displays both matrices.
Finds the sum of elements of the first matrix.
Prints the transpose of the first matrix.
Performs matrix addition and prints the result.
Performs matrix multiplication and prints the result.*/

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Matrix Input
        
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        System.out.println("Enter elements of 3x3 Matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 3x3 Matrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Step 2: Display Matrix 1
        System.out.println("\nMatrix 1:");
        printMatrix(matrix1);

        // Step 3: Display Matrix 2
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        // Step 4: Sum of all elements in Matrix 1
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += matrix1[i][j];
            }
        }
        System.out.println("\nSum of elements in Matrix 1: " + sum);

        // Step 5: Transpose of Matrix 1
        System.out.println("\nTranspose of Matrix 1:");
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = matrix1[j][i];
            }
        }
        printMatrix(transpose);

        // Step 6: Matrix Addition
        System.out.println("\nMatrix Addition (Matrix1 + Matrix2):");
        int[][] sumMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(sumMatrix);

        // Step 7: Matrix Multiplication
        System.out.println("\nMatrix Multiplication (Matrix1 × Matrix2):");
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        printMatrix(product);
      
        sc.close();
    }

    // Utility Method to Print Matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
