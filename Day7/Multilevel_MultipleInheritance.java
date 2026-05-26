
interface Flyable {

    void fly();
}

interface Swimmable {

    void swim();
}

class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Bird extends Animal {

    void sound() {
        System.out.println("Chirping");
    }
}

class Chicken extends Bird implements Flyable, Swimmable {

    public void fly() {
        System.out.println("Flying");
    }

    public void swim() {
        System.out.println("Swimming");
    }
}

class BoilerChicken extends Chicken {

    @Override
    public void fly() {
        super.fly();
        System.out.println("Boiler Chicken FLy");
    }

    public void sound() {
        System.out.println("Chirping");
    }
}

public class Multilevel_MultipleInheritance {

    public static void main(String[] args) {
        Chicken c = new Chicken();
        Chicken c1 = new BoilerChicken();
        // c.eat();
        // c.sound();
        // c.fly();
        // c.swim();
        c1.fly();
        // c1.sound();
    }
}
