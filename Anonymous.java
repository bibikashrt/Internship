
class Animal {

    public void makesound() {
        System.out.println("Animal Sound");
    }
}

public class Anonymous {

    public static void main(String[] args) {
        Animal a = new Animal() {
            public void makesound() {
                System.out.println("Woof woof");
            }
        };
        a.makesound();
    }
}
