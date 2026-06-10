import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Login");
        tasks.add("Add Book");
        tasks.add("Issue Book");

        System.out.println("Tasks:");

        for (String task : tasks) {
            System.out.println(task);
        }

        tasks.addFirst("Start Application");
        tasks.addLast("Logout");

        System.out.println("\nUpdated Tasks:");

        for (String task : tasks) {
            System.out.println(task);
        }
    }
}