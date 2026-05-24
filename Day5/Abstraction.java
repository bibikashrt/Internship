
abstract class Animal {

    abstract void sound();   // abstract method
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
