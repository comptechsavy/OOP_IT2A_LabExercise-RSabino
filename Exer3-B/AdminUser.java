public class AdminUser {
    
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String role;

   public AdminUser() {
        this.firstName = "no first name";
        this.lastName = "no last name";
        this.username = "no username";
        this.password = "no password";
        this.role = "no role";
    }
    public AdminUser(String firstName, String lastName, String username, String password, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getUsername() {
        return this.username;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
            this.password = password;
    }
    public String getRole() {
        return this.role;
    }
    public void setRole(String role) { 
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("User: " + username + " | Role: " + role);
    }
}

