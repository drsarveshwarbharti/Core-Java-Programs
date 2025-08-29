//break, continue, and return in one Java program so you can clearly demonstrate how each works

public class JumpingStatementsDemo {
    public static void main(String[] args) {
        
        // 1. Using break
        System.out.println("=== Break Example ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking at i = " + i);
                break; // exits loop
            }
            System.out.println("i = " + i);
        }

        // 2. Using continue
        System.out.println("\n=== Continue Example ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // skips this iteration
            }
            System.out.println("i = " + i);
        }

        // 3. Using return
        System.out.println("\n=== Return Example ===");
        int result = sumUntil(5);
        System.out.println("Sum result from method = " + result);
    }

    // Method demonstrating return
    public static int sumUntil(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i == 3) {
                System.out.println("Returning at i = " + i);
                return sum; // exits method here
            }
        }
        return sum;
    }
}

/*OUTPUT:
=== Break Example ===
i = 1
i = 2
Breaking at i = 3

=== Continue Example ===
i = 1
i = 2
Skipping i = 3
i = 4
i = 5

=== Return Example ===
Returning at i = 3
Sum result from method = 6
*/
