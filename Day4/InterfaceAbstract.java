
interface Animal {

    void makeSound();

    void move();

    String getName();
}

abstract class AbstractAnimal implements Animal {

    protected String name;

    public AbstractAnimal(String name) {

        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }

    @Override
    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " is sleeping. Zzz...");
    }
}

class Elephant implements Animal {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void move() {

    }
}

class Dog extends AbstractAnimal {

    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(name + " the " + breed + " fetches the ball!");
    }
}

public class InterfaceAbstract {

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", "Labrador");
        dog.makeSound();
        dog.move();
        dog.fetch();
        dog.sleep();

    }
}
