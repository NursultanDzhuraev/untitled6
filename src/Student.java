public class Student extends Person{
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{}";
    }

    public Student(String name, String phoneNumber, String nationality, int age) {
        super(name, phoneNumber, nationality, age);

    }
}
