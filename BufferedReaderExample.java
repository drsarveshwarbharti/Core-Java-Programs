//Reading with BufferedReader

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Read full line as String input
        System.out.print("Enter a string: ");
        String str = br.readLine(); 

        //read() → Reads a single character (as int, Unicode/ASCII)
        System.out.print("Enter a single character: ");
        int ch = br.read(); // reads first character only

        //Read Integer input
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        //Print string 
        System.out.println("String: " + str);
        
        //Print character 
        System.out.println("character: " + (char) ch);

        //Print integer
        System.out.println("Number: " + num);

        //Use exception handling if error during execution
        try{ 
            //Read byte input
            System.out.print("Enter a integer from 0 to 127: ");
            byte b =Byte.parseByte(br.readLine());;

            //Print byte
            System.out.println("Number from 0 to 127 : " + b);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
