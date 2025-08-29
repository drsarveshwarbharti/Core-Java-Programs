//Iteration Exercises in Java based on for, while, do-while

/* A menu-driven Java program that demonstrates the use of iteration statements (for, while, do-while) through different exercises. 
It is useful for students learning loops in Java and preparing for lab assignments or placements */
Features

/*
This program provides the following options in a menu format:
1. Sum of Natural Numbers – Find the sum of first 10 natural numbers.
2. Factorial of a Number – Compute factorial using a while loop.
3. Reverse a Number – Reverse the digits of an integer.
4. Multiplication Table – Print table of a given number.
5. Print Even Numbers – Display even numbers from 1 to 20.
6. Sum of Digits – Find the sum of digits of a number.
7. Check Prime Number – Verify if a number is prime or not.
8. Pattern Printing – Print a simple star (*) pattern.
9. Exit – Terminate the program.
*/
/*
🖥️ Sample Menu:
=== Iteration Exercises Menu ===
1. Sum of Natural Numbers
2. Factorial of a Number
3. Reverse a Number
4. Multiplication Table
5. Print Even Numbers
6. Sum of Digits
7. Check Prime Number
8. Pattern Printing
9. Exit
Enter your choice: 
*/

import java.util.Scanner;

public class IterationMenuExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Iteration Exercises Menu ===");
            System.out.println("1. Sum of Natural Numbers");
            System.out.println("2. Factorial of a Number");
            System.out.println("3. Reverse a Number");
            System.out.println("4. Multiplication Table");
            System.out.println("5. Print Even Numbers");
            System.out.println("6. Sum of Digits");
            System.out.println("7. Check Prime Number");
            System.out.println("8. Pattern Printing");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //Sum of Natural Numbers
                    int sum = 0;
                    for (int i = 1; i <= 10; i++) sum += i;
                    System.out.println("Sum of first 10 natural numbers = " + sum);
                    break;

                case 2:
                    //Factorial of a Number
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    int fact = 1;
                    while (n > 0) {
                        fact *= n;
                        n--;
                    }
                    System.out.println("Factorial = " + fact);
                    break;

                case 3:
                    //Reverse a Number
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    int rev = 0;
                    while (num > 0) {
                        int digit = num % 10;
                        rev = rev * 10 + digit;
                        num /= 10;
                    }
                    System.out.println("Reversed number = " + rev);
                    break;

                case 4:
                    //Multiplication Table
                    System.out.print("Enter a number: ");
                    int m = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(m + " x " + i + " = " + (m * i));
                    }
                    break;

                case 5:
                    //Print Even Numbers
                    int i = 2;
                    System.out.println("Even numbers from 1 to 20:");
                    do {
                        System.out.print(i + " ");
                        i += 2;
                    } while (i <= 20);
                    System.out.println();
                    break;

                case 6:
                    //Sum of Digits
                    System.out.print("Enter a number: ");
                    int x = sc.nextInt();
                    int digitSum = 0;
                    while (x > 0) {
                        digitSum += x % 10;
                        x /= 10;
                    }
                    System.out.println("Sum of digits = " + digitSum);
                    break;

                case 7:
                    //Check Prime Number
                    System.out.print("Enter a number: ");
                    int p = sc.nextInt();
                    boolean isPrime = true;
                    if (p <= 1) isPrime = false;
                    else {
                        for (int j = 2; j <= p / 2; j++) {
                            if (p % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) System.out.println(p + " is Prime.");
                    else System.out.println(p + " is Not Prime.");
                    break;

                case 8:
                    //Pattern Printing
                    System.out.println("Pattern:");
                    for (int r = 1; r <= 5; r++) {
                        for (int c = 1; c <= r; c++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 9:
                    //Exit
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}


/*
Exercises Covered in this menu driven program:

Sum of Natural Numbers
Write a program using a for loop to calculate the sum of the first 10 natural numbers.

Factorial of a Number
Write a program using a while loop to find the factorial of a given number.

Reverse a Number
Write a program using a while loop to reverse the digits of a given number (e.g., input 1234, output 4321).

Multiplication Table
Write a program using a for loop to display the multiplication table of any number entered by the user.

Print Even Numbers
Write a program using a do-while loop to print all even numbers between 1 and 20.

Sum of Digits
Write a program using a while loop to calculate the sum of digits of a number (e.g., input 123, output 6).

Check Prime Number
Write a program using a for loop to check whether a number is prime or not.

Pattern Printing
Write a program using nested for loops to print the following pattern:

*
**
***
****
*****

*/
