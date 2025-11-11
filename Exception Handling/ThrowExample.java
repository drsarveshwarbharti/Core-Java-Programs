//throw Keyword
//The throw keyword is used inside a method or block to explicitly throw an exception object.
//It is followed by an instance of an exception (e.g., new ArithmeticException()).
//It transfers control to the nearest catch block that can handle that exception.

/* Syntax:
throw new ExceptionType("Error Message");
*/
public class ThrowExample {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be 18 or older!");
        } else {
            System.out.println("Access granted - Welcome!");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
        System.out.println("End of program");
    }
}

//Output: Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be 18 or older!

//Explanation:
//When age is less than 18, an ArithmeticException is explicitly thrown.
//The program terminates unless handled with a try-catch block.
