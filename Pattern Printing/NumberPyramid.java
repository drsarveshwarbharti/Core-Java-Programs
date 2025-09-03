/* Printing a number pyramid pattern in Java (using loops).
The pattern looks like this:

    1
   121
  12321
 1234321

✅ This uses nested loops:

First loop → number of rows
Second loop → spaces before numbers
Third loop → ascending numbers
Fourth loop → descending numbers

*/
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            // Print spaces
            for (int j = i; j < rows; j++) {
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


/*
Output:
Enter the number of rows: 4
   1
  121
 12321
1234321
*/
