public class TypeCastingExample {
    public static void main(String[] args) {
        // 1. Widening Casting (Implicit) - smaller to larger type
        int intVal = 100;
        double doubleVal = intVal;   // int -> double (automatic)
        System.out.println("Widening Casting:");
        System.out.println("int value: " + intVal);
        System.out.println("double value (after widening): " + doubleVal);

        // 2. Narrowing Casting (Explicit) - larger to smaller type
        double num = 99.99;
        int intNum = (int) num;      // double -> int (manual)
        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + num);
        System.out.println("int value (after narrowing): " + intNum);

        // 3. Casting with characters
        char ch = 'A';
        int ascii = (int) ch;        // char -> int
        System.out.println("\nCharacter Casting:");
        System.out.println("char value: " + ch);
        System.out.println("ASCII value of 'A': " + ascii);

        int code = 66;
        char letter = (char) code;   // int -> char
        System.out.println("int value: " + code);
        System.out.println("char value of 66: " + letter);

        // 4. Casting between float and int
        float f = 7.5f;
        int rounded = (int) f;
        System.out.println("\nFloat to Int Casting:");
        System.out.println("float value: " + f);
        System.out.println("int value (after casting): " + rounded);
    }
}
