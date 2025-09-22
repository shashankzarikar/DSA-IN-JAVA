public class Statickeyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Shashank";
        s1.roll = 123;
        s1.schoolName = "SGGS";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "DYP";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);

    }

}

class Student {
    String name;
    int roll;
    static String schoolName;

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }
}