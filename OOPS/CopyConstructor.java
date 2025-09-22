public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "romit";
        s1.roll = 121;
        s1.password = "abcd";
        s1.marks[0] = 89;
        s1.marks[1] = 80;
        s1.marks[2] = 75;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        s1.name="shashank";    

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);

    }

}

class Student {

    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Constructor
    
     Student(Student s1){

     this.name=s1.name;
     this.roll=s1.roll;
     this.marks=s1.marks;
     
      }
     
    
    /*Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }*/

    Student() {
        marks = new int[3];

    }
}
