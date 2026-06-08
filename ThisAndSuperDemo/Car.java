
public class Car extends Vehicle {

    private String model;

    public Car() {

        this("Toyota", "Corolla");
    }

    public Car(String brand, String model) {

        super(brand);

        this.model = model;
    }

    public void display() {

        super.display();

        System.out.println("Model: " + model);
    }
}
