
abstract class Vehicle {

    abstract void start();

    void fuelType() {
        System.out.println("Fuel Required");
    }
}

interface GPS {

    void location();
}

class Car extends Vehicle implements GPS {

    @Override
    void start() {
        System.out.println("Car Started");
    }

    @Override
    public void location() {
        System.out.println("GPS Enabled");
    }
}

public class VehicleDemo {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.fuelType();
        c.location();
    }
}
