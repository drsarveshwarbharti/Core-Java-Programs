//Java program that demonstrates all Operators in Java

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators (Comparison) Operators
        //(Comparison) Operators Used to compare two values. Returns true or false.
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 3. Logical Operators
        //Used for logical operations with boolean values
        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y)); //Logical AND e.g. (a > 5 && b < 10)
        System.out.println("x || y : " + (x || y)); //Logical OR e.g. (a < 5 || b < 10)
        System.out.println("!x     : " + (!x)); //Logical NOT e.g. !(a > b)

        // 4. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int c = a;
        c += 3;
        System.out.println("c += 3 : " + c);
        c -= 2;
        System.out.println("c -= 2 : " + c);
        c *= 2;
        System.out.println("c *= 2 : " + c);
        c /= 2;
        System.out.println("c /= 2 : " + c);
        c %= 3;
        System.out.println("c %= 3 : " + c);

        // 5. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // pre-increment
        System.out.println("d++ = " + (d++)); // post-increment
        System.out.println("d after post-increment = " + d);
        System.out.println("--d = " + (--d)); // pre-decrement
        System.out.println("d-- = " + (d--)); // post-decrement
        System.out.println("d after post-decrement = " + d);
        System.out.println("-d = " + (-d));   // negation

        // 6. Bitwise Operators
        //Work on bits (0s and 1s)
        System.out.println("\n=== Bitwise Operators ===");
        int e = 5, f = 3; // 0101 and 0011
        System.out.println("e & f : " + (e & f)); // AND 
        System.out.println("e | f : " + (e | f)); // OR
        System.out.println("e ^ f : " + (e ^ f)); // XOR
        System.out.println("~e    : " + (~e));    // NOT
        System.out.println("e << 1: " + (e << 1)); // Left shift
        System.out.println("e >> 1: " + (e >> 1)); // Right shift

        // 7. Ternary Operator
        //Shorthand for if-else
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // 8. instanceof Operator
        //Checks whether an object is an instance of a class
        System.out.println("\n=== instanceof Operator ===");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}

/* 
OUTPUT:
=== Arithmetic Operators ===
a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0

=== Relational Operators ===
a == b : false
a != b : true
a > b  : true
a < b  : false
a >= b : true
a <= b : false

=== Logical Operators ===
x && y : false
x || y : true
!x     : false

=== Assignment Operators ===
c += 3 : 13
c -= 2 : 11
c *= 2 : 22
c /= 2 : 11
c %= 3 : 2

=== Unary Operators ===
d = 5
++d = 6
d++ = 6
d after post-increment = 7
--d = 6
d-- = 6
d after post-decrement = 5
-d = -5

=== Bitwise Operators ===
e & f : 1
e | f : 7
e ^ f : 6
~e    : -6
e << 1: 10
e >> 1: 2

=== Ternary Operator ===
Max of a and b: 10

=== instanceof Operator ===
str instanceof String: true
*/
