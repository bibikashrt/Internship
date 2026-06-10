
import java.util.LinkedList;

public class DataLinkedList1 {

    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<Integer>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        System.out.println(number);

        number.addFirst(11);
        System.out.println("Add First: " + number);

        number.addLast(5);
        System.out.println("Add Last: " + number);

        System.out.println("Get: " + number.get(2));

        number.removeFirst();
        System.out.println("Remove: " + number);

        number.removeLast();
        System.out.println("Remove Last: " + number);

        System.out.println("Does 11 contain?" + number.contains(11));
    }
}
