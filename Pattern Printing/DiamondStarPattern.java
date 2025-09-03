/*
Diamond Star Pattern Example (rows = 4)
   *
  ***
 *****
*******
 *****
  ***
   *
*/

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Upper half (normal pyramid)
        for (int i = 1; i <= rows; i++) {
            
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1 stars in each row)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half (inverted pyramid)
        for (int i = rows - 1; i >= 1; i--) {
            
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

/* Output: 
Enter the number of rows: 4
   *
  ***
 *****
*******
 *****
  ***
   *
*/
