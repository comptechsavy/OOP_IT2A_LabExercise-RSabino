public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String plateNo;
    private String chassisNo;
    private String Speed;
    private String fuelType;

    public Car(){
        this.make = "No make";
        this.model = "No model";
        this.year = 0;
        this.color = "No color";
        this.plateNo = "No plateNo";
        this.chassisNo = "No chassisNo";
        this.Speed = "No Speed";
        this.fuelType = "No fuel";
    }
    public Car(String make, String model, int year, String color, String plateNo, String chassisNo, String Speed, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.Speed = Speed;
        this.fuelType = fuelType;
    }
     public void displayInfo(){
        String info = "" ;
        info += "Make: " + this.make;
        info += "\nModel: " + this.model;
        info += "\nYear: " + this.year;
        info += "\nColor: " + this.color;
        info += "\nPlate No: " + this.plateNo;
        info += "\nChassis No: " + this.chassisNo;
        info += "\nSpeed: " + this.Speed;
        info += "\nFuel: " + this.fuelType;
        System.out.println(info);
                      
     }
}
