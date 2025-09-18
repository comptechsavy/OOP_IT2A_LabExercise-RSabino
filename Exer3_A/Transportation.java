public class Transportation {
    
    private String name;   
    private double speed;  

    public Transportation(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Accelerate to run.");
        }
    }

    public void move() {
        System.out.println(name + " is moving at " + speed + " km/h.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Speed: " + speed + " km/h");
    }
}

class AirTransport extends Transportation {
    public AirTransport(String name, double speed) {
        super(name, speed);
        
    }
}

class Helicopter extends AirTransport {
    public Helicopter(double speed) {
        super("Helicopter", speed);
    }
}

class Airplane extends AirTransport {
    public Airplane(double speed) {
        super("Airplane", speed);
    }
}

class spaceShuttle extends AirTransport {
    public spaceShuttle(double speed) {
        super("spaceShuttle", speed);
    }
}

class LandTransport extends Transportation {
    public LandTransport(String name, double speed) {
        super(name, speed);
    }
}

class Truck extends LandTransport {
    public Truck(double speed) {
        super("Truck", speed);
    }
}

class SUV extends LandTransport {
    public SUV(double speed) {
        super("SUV", speed);
    }
}

class Tricycle extends LandTransport {
    public Tricycle(double speed) {
        super("Tricycle", speed);
    }
}

class Motorcycle extends LandTransport {
    public Motorcycle(double speed) {
        super("Motorcycle", speed);
    }
}

class Kariton extends LandTransport {
    public Kariton(double speed) {
        super("Kariton", speed);
    }
}

class WaterTransport extends Transportation {
    public WaterTransport(String name, double speed) {
        super(name, speed);
    }
}

class Jetski extends WaterTransport {
    public Jetski(double speed) {
        super("Jetski", speed);
    }
}

class Yatch extends WaterTransport {
    public Yatch(double speed) {
        super("Yatch", speed);
    }
}