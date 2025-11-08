//Referring to Instance Variables
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // differentiates instance variable from parameter
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        Student s1 = new Student("Riya", 21);
        s1.display();
    }
}

/*
Output:
Name: Riya, Age: 21
*/
