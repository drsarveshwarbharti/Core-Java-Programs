//Calling Another Constructor
class Employee {
    String name;
    int salary;

    Employee() {
        this("Unknown", 0);  // calls parameterized constructor
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " earns " + salary);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ankit", 50000);
        e1.display();
        e2.display();
    }
}

/*
Output:
Unknown earns 0
Ankit earns 50000
*/
