public class Volunteer extends AdminUser {
    
    private String fullName;
    private String skills;
    private String availability;

    public Volunteer(String fullName, String skills, String availability) {
        super();
        this.fullName = fullName;
        this.skills = skills;
        this.availability = availability;
    }
    public String getFullName() {
        return this.fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getSkills() {
        return this.skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String getAvailability() {
        return this.availability;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    public void displayInfo() {
        System.out.println("Volunteer Name: " + fullName + " | Skills: " + skills + " | Availability: " + availability);
    }
    
}
