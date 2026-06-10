
import java.util.ArrayList;
import java.util.Collections;

public class DataStructureArray {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("After adding" + cars);

        cars.add(1, "Terrois");
        System.out.println("After adding at index 1: " + cars);

        System.out.println("Element at index 0: " + cars.get(0));

        cars.set(3, "Dayun");
        System.out.println("After set: " + cars);

        cars.remove(0);
        System.out.println("After remove index 0: " + cars);

        //cars.clear();
        System.out.println("Size: " + cars.size());

        Collections.sort(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
