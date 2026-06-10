
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Ram");
        students.add("Shyam");
        students.add("Hari");

        System.out.println("Student List:");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("\nFirst Student: " + students.get(0));

        students.remove("Shyam");

        System.out.println("\nAfter Removal:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
