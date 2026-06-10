import java.util.ArrayList;

public class LibraryBooks {

    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();

        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Database Management");

        System.out.println("Available Books:");

        for (String book : books) {
            System.out.println(book);
        }

        books.remove("Data Structures");

        System.out.println("\nAfter Removing Book:");

        for (String book : books) {
            System.out.println(book);
        }
    }
}