public class Provider extends AdminUser {
    
    private String organizationName;
    private String serviceType;
    private String contactInfo;

    public Provider(String organizationName, String serviceType, String contactInfo) {
        super();
        this.organizationName = organizationName;
        this.serviceType = serviceType;
        this.contactInfo = contactInfo;
    }
    public String getCompanyName() {
        return this.organizationName;
    }
    public void setCompanyName(String organizationName) {
        this.organizationName = organizationName;
    }
    public String getServiceType() {
        return this.serviceType;
    }
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void displayInfo() {
        System.out.println("Provider Organization: " + organizationName + " | Service Type: " + serviceType + " | Contact Info: " + contactInfo);
    }
}