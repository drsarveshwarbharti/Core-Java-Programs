// Program: FileCopyExample.java
// Copies data from one file to another using FileInputStream and FileOutputStream
/*
Explanation:
Step	Description
1️⃣	  Create FileInputStream to read from the source file (source.txt).
2️⃣	  Create FileOutputStream to write into the destination file (destination.txt).
3️⃣	  Use a loop to read bytes one by one from the input stream and write them to the output stream.
4️⃣	  Close both streams inside the finally block to release resources.
*/

import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            // Source and destination file paths
            input = new FileInputStream("source.txt");
            output = new FileOutputStream("destination.txt");

            int byteData;
            // Read each byte from source and write it to destination
            while ((byteData = input.read()) != -1) {
                output.write(byteData);
            }

            System.out.println("✅ File copied successfully!");

        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        } finally {
            try {
                // Always close streams
                if (input != null) input.close();
                if (output != null) output.close();
            } catch (IOException e) {
                System.out.println("⚠️ Error while closing files: " + e.getMessage());
            }
        }
    }
}

//Output:
//File copied successfully!
