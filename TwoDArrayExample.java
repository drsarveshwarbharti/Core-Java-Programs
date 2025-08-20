//Simple Java program that demonstrates declaring, initializing, and using a 2D array
public class TwoDArrayExample {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        //Declaring and initializing Array by taking input from user using Scanner
        /*
        Scanner sc = new Scanner(System.in);
        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        */
        
        // 2. Accessing Elements/Single element
        System.out.println("Element at [0][1]: " + matrix[0][1]); // 2
        
        /*
        // Reading/accessing all elements of  2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        */

        // 3. Printing the 2D array using nested loops
        System.out.println("\n2D Array Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 4. Summing all elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("\nSum of all elements: " + sum);
    }
}

/* OUTPUT:
Element at [0][1]: 2

2D Array Elements:
1 2 3 
4 5 6 
7 8 9 

Sum of all elements: 45 */
