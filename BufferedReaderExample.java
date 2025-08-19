//Reading with BufferedReader

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String str = br.readLine();

        try{           
        System.out.print("Enter a integer from 0 to 127: ");
        byte b =Byte.parseByte(br.readLine());;
        System.out.println("Number from 0 to 127 : " + b);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("String: " + str);
        System.out.println("Number: " + num);
    }
}
