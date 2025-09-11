public class CarTester {
    public static void main(String[] args) {
        
        Car c1 = new Car("Toyota", "Hilux", 2025, "White", "ABC1623", "XYZ789450", "2393 - 2755 cc", "Automatic", "148 - 221 hp", "Diesel");
        Car c2 = new Car("Ford", "Raptor", 2025, "Red", "DEF5456", "UVW123624", "1996 - 2956 cc", "Automatic", "208 - 397 hp", "Gasoline");
        Car c3= new Car("Mitsubishi", "Montero", 2025, "White", "AXC1253", "LMU436789", "2398 cc", "Automatic", "179 hp", "Diesel");
        Car c4 = new Car("Nissan", "Navarra", 2025, "Gold", "LEF4567", "UVL442123", "2488 cc", "Automatic", "187 hp", "Diesel");
        Car c5 = new Car("Toyota", "Land Cruiser", 2025, "White", "AUM1923", "ZYZ756789", "4,461 cc", "Automatic", "302 hp", "Gasoline");
        Car c6= new Car("Mercedez-Benz", "S 580 4MATIC", 2025, "Black", "DEX0456", "USW125763", "4.0L V8 Biturbo", "Automatic", "496 hp", "Petrol");
        Car c7= new Car("BMW 7Series", "760i xDrive", 2025, "White", "ABP1023", "MYZ780049", "4.4L Twin-Turbo V8", "Automatic", "536 hp", "Petrol");
        Car c8 = new Car("Audi", "A8 L 60 TFSI e", 2025, "Black", "DCL4546", "UVQ124223", "3.0L V6 TURBO+", "Automatic", "443 hp", "Plug-in Hybrid(Petrol + Electric)");
        Car c9 = new Car("Lexus", "LS 500h", 2025, "White", "ABL1254", "XTZ781149", "3.5L V6 Hybrid", "Multi-Staged Hybrid", "354 hp", "Hybrid(Petrol + Electric)");
        Car c10 = new Car("Rolls-Royce", "Phantom", 2025, "Gold", "DEL4026", "UVU124403", "6.75L V12 Twin-Turbo", "Automatic", "563 hp", "Petrol");

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
        c4.displayInfo();
        c5.displayInfo();
        c6.displayInfo();
        c7.displayInfo();
        c8.displayInfo();
        c9.displayInfo();
        c10.displayInfo();

    }
}

