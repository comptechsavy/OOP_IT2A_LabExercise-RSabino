package CommunityAidHub;

public class Main {
    public static void main(String[] args) {
        // Create objects
        Beneficiary b1 = new Beneficiary("Juan Dela Cruz", 30, "Male", "Mati City Davao Oriental", "09123456789", "Red Cross", "Food and Shelter", "Pending", "None");
        Volunteer v1 = new Volunteer("Maria Santos", 25, "09223456789", "First Aid", 120);
        Admin a1 = new Admin ("AdminUser", "Admin12345","Reyjoy Sabino", "reyjoy.sabino@dorsu.edu.ph", "Manager");
        
          
        b1.displayInfo();
        v1.displayInfo();
        a1.displayInfo();
    }
}

    

    



