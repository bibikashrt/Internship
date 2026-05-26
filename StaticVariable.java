
class Vehicle {

    String brand;
    int price;
    String color;
    static String name;

    public void show() {
        System.out.println(brand + " :" + price + " :" + color + " : " + name);
    }

    public static void show1(Vehicle v) {
        System.out.println(v.brand + " :" + v.price + " :" + v.color + " : " + name);
    }

}

public class StaticVariable {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.brand = "Toyota";
        v1.price = 100000;
        v1.color = "Red";
        Vehicle.name = "Electric";

        Vehicle v2 = new Vehicle();
        v2.brand = "Dayun";
        v2.price = 100000;
        v2.color = "White";
        Vehicle.name = "Electric";

        v1.name = "Petrol";
        v1.show();
        v2.show();

        Vehicle.show1(v1);

    }

}
