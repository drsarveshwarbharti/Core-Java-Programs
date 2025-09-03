/*
Hollow Diamond Star Pattern (rows = 4)
   *
  * *
 *   *
*     *
 *   *
  * *
   *
   
*/
import java.util.Scanner;

public class HollowDiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Upper half
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*"); // border star
                } else {
                    System.out.print(" "); // inside space
                }
            }

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*"); // border star
                } else {
                    System.out.print(" "); // inside space
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
/*
OutPut:

Enter the number of rows: 4
   *
  * *
 *   *
*     *
 *   *
  * *
   *
   
*/
