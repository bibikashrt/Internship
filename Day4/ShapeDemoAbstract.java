
abstract class Shape {

    abstract void area();

    void message() {
        System.out.println("Calculating area...");
    }
}

interface Color {

    void fillColor();
}

class Circle extends Shape implements Color {

    int radius = 7;

    @Override
    void area() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    @Override
    public void fillColor() {
        System.out.println("Color: Blue");
    }
}

public class ShapeDemoAbstract {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.message();
        c.area();
        c.fillColor();
    }
}
