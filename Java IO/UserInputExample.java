import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();          // Read string input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();               // Read integer input

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close();  // Close scanner
    }
}
