
import java.util.HashSet;

public class DataHashSet1 {

    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<Integer>();

        number.add(18);
        number.add(2);
        number.add(7);
        number.add(10);

        System.out.println("The List of number: " + number);

        System.out.println("Does 10 contain? " + number.contains(10));

        for (int i = 1; i <= 20; i++) {
            if (number.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }

}
