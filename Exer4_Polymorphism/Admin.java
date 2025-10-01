public class Admin extends Person {
    public Admin(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Role: Admin");
        super.displayInfo();
    }
}
