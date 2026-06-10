
import java.util.ArrayList;

public class DataArray {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);

        number1.add(11);
        number1.add(12);
        number1.add(13);
        number1.add(14);
        System.out.println("After adding:" + number);

        number.add(4, 9);
        number.add(5, 10);
        System.out.println("Adding in index 4 and 5:" + number);

        number.addAll(number1);
        System.out.println("After addAll: " + number);

        System.out.println("Element at index 2:" + number.get(2));

        number.set(3, 15);
        System.out.println("After set:" + number);

        number.remove(2);
        System.out.println("After removing:" + number);

        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }

        for (int i : number) {
            System.out.println(i);
        }
    }

}
