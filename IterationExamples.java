//Java program that demonstrates all three iteration statements (for, while, do-while) in one place:

public class IterationExamples {
    public static void main(String[] args) {

        // ===== For Loop =====
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop iteration: i = " + i);
        }

        // ===== While Loop =====
        System.out.println("\n=== While Loop ===");
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop iteration: j = " + j);
            j++;
        }

        // ===== Do-While Loop =====
        System.out.println("\n=== Do-While Loop ===");
        int k = 1;
        do {
            System.out.println("Do-While Loop iteration: k = " + k);
            k++;
        } while (k <= 5);

        // Showing difference (do-while runs at least once)
        System.out.println("\n=== Do-While runs once even if condition is false ===");
        int x = 10;
        do {
            System.out.println("This executes even though x > 5 (x = " + x + ")");
        } while (x < 5);
    }
}
