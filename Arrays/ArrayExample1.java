//Simple Java program that shows different ways to declare, initialize, and use arrays
/*This program covers:
Declaration and assignment separately
Initialization in one line
Using new keyword with values
Different data types (int, String)
Looping: for loop and enhanced for loop */

public class ArrayExample1{
    public static void main(String[] args) {
        // 1. Declaration and then initialization
        int[] arr1 = new int[5];    // size 5
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        // 2. Declaration with initialization in one line
        int[] arr2 = {5, 10, 15, 20, 25};

        // 3. Another way of initialization using 'new'
        int[] arr3 = new int[]{100, 200, 300};

        // 4. Using different data type (String array)
        String[] names = {"Alice", "Bob", "Charlie"};

        // Printing arrays
        System.out.println("arr1 elements:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n\narr2 elements:");
        for (int val : arr2) {   // enhanced for loop
            System.out.print(val + " ");
        }

        System.out.println("\n\narr3 elements:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println("\n\nnames array:");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
