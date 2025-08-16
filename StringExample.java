public class StringExample {
    public static void main(String[] args) {
        // 1. Creating Strings
        String s1 = "Hello";              // String literal
        String s2 = new String("World");  // Using new keyword

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. String Concatenation
        String s3 = s1 + " " + s2;
        System.out.println("Concatenated String: " + s3);

        // 3. String Methods
        System.out.println("\n--- String Methods ---");
        System.out.println("Length of s3: " + s3.length());
        System.out.println("Uppercase: " + s3.toUpperCase());
        System.out.println("Lowercase: " + s3.toLowerCase());
        System.out.println("Substring(0,5): " + s3.substring(0, 5));
        System.out.println("Character at index 1: " + s3.charAt(1));
        System.out.println("Contains 'Hello': " + s3.contains("Hello"));
        System.out.println("Equals 'Hello World': " + s3.equals("Hello World"));
        System.out.println("EqualsIgnoreCase 'hello world': " + s3.equalsIgnoreCase("hello world"));

        // 4. Splitting String
        String names = "Alice,Bob,Charlie";
        String[] arr = names.split(",");
        System.out.println("\nSplit result:");
        for (String name : arr) {
            System.out.println(name);
        }

        // 5. StringBuilder (mutable string)
        System.out.println("\n--- StringBuilder Example ---");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");   // add text
        sb.insert(0, "Welcome to "); // insert text
        sb.replace(11, 21, "C++");   // replace part
        sb.delete(0, 11);            // delete part
        sb.reverse();                // reverse string
        System.out.println("Final StringBuilder result: " + sb);
    }
}
