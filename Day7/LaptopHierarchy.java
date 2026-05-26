
class Device {

    void powerOn() {
        System.out.println("Device powered on");
    }
}

class Computer extends Device {

    void process() {
        System.out.println("Computer processing");
    }
}

class Laptop extends Computer {

    void portable() {
        System.out.println("Laptop is portable");
    }
}

public class LaptopHierarchy {

    public static void main(String[] args) {

        Laptop l = new Laptop();

        l.powerOn();
        l.process();
        l.portable();
    }
}
