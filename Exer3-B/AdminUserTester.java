public class AdminUserTester {
    public static void main(String[] args) {

        Beneficiary ben = new Beneficiary("B001", "New York", "123-456-7890", "Food Assistance", "Active");
        Provider pro = new Provider("Red Cross Philippines", "Livelihood Training", "09253567896");
       Volunteer vol = new Volunteer("Juan Dela Cruz", "Skills Training", "Available");   
  
        ben.displayInfo();
        pro.displayInfo();
        vol.displayInfo();  
    }
}
