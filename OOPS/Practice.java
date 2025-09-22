public class Practice {
    public static void main (String args[]) {
        Student s = new Student();
    }
}

class Person {
    Person(String name) { }

    Person() {
        
    }
}

class Student extends Person {
    Student() {
        // super(); // error: no default constructor in Person
    }
}
