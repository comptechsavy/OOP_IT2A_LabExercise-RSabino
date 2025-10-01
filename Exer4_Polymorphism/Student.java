// ...existing code...
public class Student extends Person {
    private String studentId;
    private String major;

    public Student(String firstName, String lastName, String username, String password, String studentId, String major) {
        super(firstName, lastName, username, password);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("Role: Student");
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}