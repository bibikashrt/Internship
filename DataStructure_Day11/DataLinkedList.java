
import java.util.Collections;
import java.util.LinkedList;

public class DataLinkedList {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();

        fruits.add("Grapes");
        fruits.add("Papaya");
        fruits.add("Watermelon");
        fruits.add("Apple");

        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println("Sorting: " + fruits);

        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Reverse Order: " + fruits);

        fruits.addFirst("Mango");
        System.out.println("Add at first: " + fruits);

        fruits.addLast("Banana");
        System.out.println("Add at last: " + fruits);

        System.out.println("Fruit at first: " + fruits.getFirst());

        System.out.println("Fruit at last: " + fruits.getLast());

        fruits.removeFirst();
        System.out.println("Remove first: " + fruits);

        fruits.removeLast();
        System.out.println("Remove last: " + fruits);

        fruits.add(1, "Guava");
        System.out.println("After adding at index 1: " + fruits);

        fruits.set(2, "Pineapple");
        System.out.println("After set: " + fruits);

        System.out.println("Contains Orange? " + fruits.contains("Orange"));

        System.out.println("Size: " + fruits.size());
        System.out.println("All Elements:");

        for (String item : fruits) {
            System.out.println(item);
        }
    }

}
