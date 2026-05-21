
interface Workable {

    void study();

    void sleep();
}

abstract class Read implements Workable {

    String name;

    public Read(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class IT extends Read {

    IT(String name) {
        super(name);
    }

    public void study() {
        display();

        System.out.println("Student is studying");
    }

    public void sleep() {
        System.out.println("Student is sleeping");
    }

}

public class Student {

    public static void main(String[] args) {
        Workable w = new IT("Cosmos IT Department");
        w.study();
        w.sleep();
    }
}
