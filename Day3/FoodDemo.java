
abstract class Food {

    abstract void prepare();

    void restaurantName() {
        System.out.println("Food Hub");
    }
}

interface Delivery {

    void deliver();
}

class Pizza extends Food implements Delivery {

    @Override
    void prepare() {
        System.out.println("Pizza is being prepared");
    }

    @Override
    public void deliver() {
        System.out.println("Pizza delivered");
    }
}

public class FoodDemo {

    public static void main(String[] args) {

        Pizza p = new Pizza();

        p.restaurantName();
        p.prepare();
        p.deliver();
    }
}
