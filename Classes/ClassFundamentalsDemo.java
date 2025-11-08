// Demonstrating Class Fundamentals in Java

//Class Fundamentals, Declaring objects, introducing methods, constructors, this keyword, Overloading constructors, Recursion, Nested and Inner classes.

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor (Overloading)
    Student(String name, int age) {
        this.name = name;   // using 'this' keyword
        this.age = age;
    }

    // Method to display student info
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Recursive method (factorial example)
    int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Nested Inner Class
    class Address {
        String city;
        String state;

        Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        void showAddress() {
            System.out.println("Address: " + city + ", " + state);
        }
    }
}

public class ClassFundamentalsDemo {
    public static void main(String[] args) {

        // Declaring objects
        Student s1 = new Student();  // default constructor
        Student s2 = new Student("Mehak", 20);  // parameterized constructor

        // Using methods
        s1.display();
        s2.display();

        // Factorial using recursion
        System.out.println("Factorial of 5 = " + s2.factorial(5));

        // Using nested/inner class
        Student.Address addr = s2.new Address("Amritsar", "Punjab");
        addr.showAddress();
    }
}
