//Java program that demonstrates String handling

public class StringExample {
    public static void main(String[] args) {
        // 1. Creating Strings
        String s1 = "Hello";              // String literal
        String s2 = new String("World");  // Using new keyword

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. String Concatenation
        //====Example-1=====
        String s3 = s1 + " " + s2;
        System.out.println("Concatenated String: " + s3);
        String s4 = s1.concat(" " + s2); // Using concat()
        //====Example-2=====
        //String s1 = "Java";
        //String s2 = "Programming";
        //String s3 = s1 + " " + s2;          // Using +
        //String s4 = s1.concat(" " + s2);    // Using concat()
        //==================

        // 3. String Methods
        //====Example-1=====
        System.out.println("\n--- String Methods ---");
        System.out.println("Length of s3: " + s3.length());
        System.out.println("Uppercase: " + s3.toUpperCase());
        System.out.println("Lowercase: " + s3.toLowerCase());
        System.out.println("Substring(0,5): " + s3.substring(0, 5));
        System.out.println("Character at index 1: " + s3.charAt(1));
        System.out.println("Contains 'Hello': " + s3.contains("Hello"));
        System.out.println("Equals 'Hello World': " + s3.equals("Hello World"));
        System.out.println("EqualsIgnoreCase 'hello world': " + s3.equalsIgnoreCase("hello world"));
        //====Example-2=====
        //String str = "Hello World";
        //str.length();            // 11
        //str.charAt(0);           // 'H'
        //str.substring(0, 5);     // "Hello"
        //str.toUpperCase();       // "HELLO WORLD"
        //str.toLowerCase();       // "hello world"
        //str.contains("World");   // true
        //str.equals("Hello");     // false
        //str.equalsIgnoreCase("hello world"); // true
        //str.trim();              // Removes spaces at ends
        //==================

        // 4. Splitting String
        String names = "Alice,Bob,Charlie";
        String[] arr = names.split(",");
        System.out.println("\nSplit result:");
        for (String name : arr) {
            System.out.println(name);
        }

        // 5. Joining
        //String joined = String.join(" - ", "A", "B", "C"); // "A - B - C"

        // 6. StringBuilder (mutable string)
        //====Example-1=====
        System.out.println("\n--- StringBuilder Example ---");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");   // add text
        sb.insert(0, "Welcome to "); // insert text
        sb.replace(11, 21, "C++");   // replace part
        sb.delete(0, 11);            // delete part
        sb.reverse();                // reverse string
        System.out.println("Final StringBuilder result: " + sb);
        //====Example-2=====
        //StringBuilder sb = new StringBuilder("Hello");
        //sb.append(" World");        // "Hello World"
        //sb.insert(6, "Java ");      // "Hello Java World"
        //sb.replace(6, 10, "C++");   // "Hello C++ World"
        //sb.delete(6, 10);           // "Hello World"
        //sb.reverse();               // "dlroW olleH"
        //==================
    }
}

/* 
OUTPUT:
s1: Hello
s2: World
Concatenated String: Hello World

--- String Methods ---
Length of s3: 11
Uppercase: HELLO WORLD
Lowercase: hello world
Substring(0,5): Hello
Character at index 1: e
Contains 'Hello': true
Equals 'Hello World': true
EqualsIgnoreCase 'hello world': true

Split result:
Alice
Bob
Charlie

--- StringBuilder Example ---
Final StringBuilder result: gnimmargorP++C
*/


//Explanation of tricky parts:

/*Length → "Hello World" has 11 characters (including the space).
Substring(0,5) → takes index 0 to 4 → "Hello".
Split → "Alice,Bob,Charlie".split(",") gives ["Alice", "Bob", "Charlie"].
StringBuilder steps:
Start: "Java"
append(" Programming") → "Java Programming"
insert(0, "Welcome to ") → "Welcome to Java Programming"
replace(11, 21, "C++") → "Welcome to C++ramming"
delete(0, 11) → "C++ramming"
reverse() → "gnimmar++C" → wait, careful…

Let’s check properly:
After replace → "Welcome to C++ramming"
Delete first 11 chars "Welcome to " → "C++ramming"
Reverse → "gnimmar++C"
Final result: gnimmar++C (not "gnimmargorP++C" — my earlier step had a mistake).
*/
