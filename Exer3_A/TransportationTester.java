public class TransportationTester {

    public static void main(String[] args) {
        
        Helicopter heli = new Helicopter(250);
        heli.displayInfo();

        Airplane plane = new Airplane(850);
        plane.displayInfo();

        spaceShuttle ss = new spaceShuttle(28000);
        ss.displayInfo();

        
        Truck truck = new Truck(120);
        truck.displayInfo();

        SUV suv = new SUV(180);
        suv.displayInfo();

        Tricycle tricycle = new Tricycle(40);
        tricycle.displayInfo();

        Motorcycle moto = new Motorcycle(110);
        moto.displayInfo();

        Kariton kariton = new Kariton(10);
        kariton.displayInfo();

      
        Jetski jetski = new Jetski(60);
        jetski.displayInfo();

       Yatch yatch = new Yatch(100);
        yatch.displayInfo();
    }
}
    

