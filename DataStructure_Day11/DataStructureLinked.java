
//import java.util.Collections;
import java.util.LinkedList;

public class DataStructureLinked {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // System.out.println("After adding" + cars);

        // cars.add(1, "Terrois");
        // System.out.println("After adding at index 1: " + cars);
        // cars.get(0);
        // System.out.println("Element at index 0: " + cars);
        // cars.set(3, "Dayun");
        // System.out.println("After set: " + cars);
        // cars.remove(0);
        // System.out.println("After remove index 0: " + cars);
        // //cars.clear();
        // cars.size();
        // System.out.println("Size: " + cars);
        // Collections.sort(cars);
        // for (int i = 0; i < cars.size(); i++) {
        //     System.out.println(cars.get(i));
        // }
        // for (String i : cars) {
        //     System.out.println(i);
        // }
        cars.addFirst("Volvo");
        cars.addFirst("BMW");
        System.out.println("After addFirst: " + cars);

        cars.addLast("Ford");
        cars.addLast("Mazda");
        System.out.println("After addLast: " + cars);

        System.out.println("First element: " + cars.getFirst());

        System.out.println("Last element: " + cars.getLast());

        cars.removeFirst();
        System.out.println("After removeFirst: " + cars);

        cars.removeLast();
        System.out.println("After removeLast: " + cars);

    }
}
