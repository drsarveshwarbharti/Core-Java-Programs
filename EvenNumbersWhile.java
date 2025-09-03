/* Java Program to find even numbers in the range of given numbers
Here we used:
while loop → runs from 1 to 50
if (i % 2 == 0) → checks even numbers

NOTE: There is a more efficient version (starting i = 2 and incrementing by 2, no if needed)
int i=2;
while (i <= 50) {
            System.out.print(i + " ");
            i += 2; // increment by 2
        }

*/
public class EvenNumbersWhile {
    public static void main(String[] args) {
        int i = 1; // start number

        System.out.println("Even numbers from 1 to 50:");

        while (i <= 50) {
            if (i % 2 == 0) { // check even
                System.out.print(i + " ");
            }
            i++; // increment
        }
    }
}

/*
OutPut:
Even numbers from 1 to 50:
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
*/
