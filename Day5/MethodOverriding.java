
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {   // overriding
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();   // calls Dog's method
    }
}
