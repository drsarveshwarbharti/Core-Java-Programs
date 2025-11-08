//Example Program: File I/O Using Streams
import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            // Write data to a file
            FileOutputStream fout = new FileOutputStream("example.txt");
            String message = "Java I/O Streams Example";
            fout.write(message.getBytes());
            fout.close();
            System.out.println("Data written to file.");

            // Read data from a file
            FileInputStream fin = new FileInputStream("example.txt");
            int i;
            System.out.print("File content: ");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
