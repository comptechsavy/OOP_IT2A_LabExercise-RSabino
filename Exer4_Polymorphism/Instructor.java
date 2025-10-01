// ...existing code...
public class Instructor extends Person {
    private String instructorId;
    private String department;

    public Instructor(String firstName, String lastName, String username, String password, String instructorId, String department) {
        super(firstName, lastName, username, password);
        this.instructorId = instructorId;
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Role: Instructor");
        super.displayInfo();
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Department: " + department);
    }
}