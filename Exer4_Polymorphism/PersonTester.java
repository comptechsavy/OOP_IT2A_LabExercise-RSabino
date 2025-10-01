public class PersonTester {
    public static void main(String[] args) {
    
        Person ad = new Admin("Alice", "Smith", "asmith", "admin123");
        System.out.println("Admin Info:");
        ad.displayInfo();
        System.out.println();
        Person s= new Student("Bob", "Johnson", "bjohnson", "student123", "S12345", "Computer Science");
        System.out.println("Student Info:");
        s.displayInfo();
        System.out.println();

        Person ins = new Instructor("Carol", "Williams", "cwilliams", "instructor123", "I67890", "Mathematics");
        System.out.println("Instructor Info:");
        ins.displayInfo();
    }
}