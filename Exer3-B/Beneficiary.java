public class Beneficiary extends AdminUser {
    
    private String iD;
    private String Location;
    private String contactNumber;
    private String assistanceType;
    private String status;

    public Beneficiary(String iD, String Location, String contactNumber, String assistanceType, String status) {
       super();
        this.iD = iD;
        this.Location = Location;
        this.contactNumber = contactNumber;
        this.assistanceType = assistanceType;
        this.status = status;
    }
    public String getID() {
        return this.iD;
    }
    public void setID(String iD) {
        this.iD = iD;
    }
    public String getLocation() {
        return this.Location;
    }
    public void setLocation(String Location) {
        this.Location = Location;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getAssistanceType() {
        return this.assistanceType;
    }
    public void setAssistanceType(String assistanceType) {
        this.assistanceType = assistanceType;
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void displayInfo() {
        System.out.println("Beneficiary ID: " + iD + " | Location: " + Location + " | Contact Number: " + contactNumber + " | Assistance Type: " + assistanceType + " | Status: " + status);
    }
}