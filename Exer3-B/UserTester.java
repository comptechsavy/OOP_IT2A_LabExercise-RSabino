public class UserTester {
    public static void main(String[] args) {

        Beneficiary b1 = new Beneficiary("Juan", "pass123");
        Provider p1 = new Provider("Tanggol", "secure456");
        Admin a1 = new Admin("Romualdes", "admin789");
        Aid aid1 = new Aid(101, "Food Supplies", 500.0);

        b1.displayInfo();
        p1.displayInfo();
        a1.displayInfo();

        b1.requestAid("Medicine and hygiene kit");
        p1.offerAid("Rice and canned goods");
        a1.manageUsers();

        aid1.displayAid();
    }
}
