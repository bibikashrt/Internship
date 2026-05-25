
class Person {

    void display() {
        System.out.println("Person Details");
    }
}

class Teacher extends Person {

    void teach() {
        System.out.println("Teacher teaches Java");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Teacher t = new Teacher();

        t.display();
        t.teach();
    }
}
