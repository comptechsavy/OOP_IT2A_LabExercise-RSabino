public class User {
    
    private String username;
    private String password;
    private String role;

   
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (!username.isEmpty()) {
            this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!password.isEmpty()) {
            this.password = password;
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) { 
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("User: " + username + " | Role: " + role);
    }
}

class Beneficiary extends User {
    public Beneficiary(String username, String password) {
        super(username, password, "BENEFICIARY");
    }

    public void requestAid(String need) {
        System.out.println(getUsername() + " requested aid for: " + need);
    }
}

class Provider extends User {
    public Provider(String username, String password) {
        super(username, password, "PROVIDER");
    }

    public void offerAid(String resource) {
        System.out.println(getUsername() + " offered aid: " + resource);
    }
}

class Admin extends User {
    public Admin(String username, String password) {
        super(username, password, "ADMIN");
    }

    public void manageUsers() {
        System.out.println(getUsername() + " is managing users.");
    }
}

class Aid {
    private int id;
    private String description;
    private double amount;

    public Aid(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (!description.isEmpty()) {
            this.description = description;
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }

    public void displayAid() {
        System.out.println("Aid ID: " + id + " | " + description + " | Amount: " + amount);
    }
}
