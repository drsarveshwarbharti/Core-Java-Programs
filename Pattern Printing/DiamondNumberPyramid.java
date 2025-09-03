/*
Combining both normal and inverted number pyramids to form a diamond shape.

Diamond Pattern Example (rows = 4)
   1
  121
 12321
1234321
 12321
  121
   1
*/
import java.util.Scanner;

public class DiamondNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Upper part (normal pyramid)
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print ascending numbers (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers (i-1 to 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower part (inverted pyramid)
        for (int i = rows - 1; i >= 1; i--) {

            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print ascending numbers (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers (i-1 to 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}

/*
Enter the number of rows: 4
   1
  121
 12321
1234321
 12321
  121
   1
*/
