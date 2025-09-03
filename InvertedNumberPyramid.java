import java.util.Scanner;

/* Print Inverted Number Pyramid

If rows = 5, the output will be:

123454321
 1234321
  12321
   121
    1
*/

public class InvertedNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print ascending numbers (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers (i-1 down to 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Next line
            System.out.println();
        }

        sc.close();
    }
}
/* OutPut:
Enter the number of rows: 5
123454321
 1234321
  12321
   121
    1
*/
