//throws Keyword
//The throws keyword is used in a method declaration to indicate that the method may throw one or more exceptions.
//It informs the caller of the method to handle those exceptions.

/* Syntax:
returnType methodName(parameters) throws ExceptionType1, ExceptionType2 {
    // method body
}
*/

import java.io.*;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println(fileInput.readLine());
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}


//Explanation:
//The readFile() method declares that it may throw an IOException.
//The main() method handles it using a try-catch block.
