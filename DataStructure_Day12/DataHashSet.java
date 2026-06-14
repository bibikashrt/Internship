
import java.util.HashSet;

public class DataHashSet {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        cars.contains("Mazda");
        System.out.println("Contains:" + cars);

        cars.remove("Volvo");
        System.out.println("After removing:" + cars);

        cars.size();
        System.out.println("Size:" + cars);

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
