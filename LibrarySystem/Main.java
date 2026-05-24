
import java.util.Scanner;

enum MenuOption {
    ADD_BOOK(1), VIEW_BOOKS(2), UPDATE_BOOK(3), DELETE_BOOK(4), SEARCH_BOOK(5), EXIT(6);

    private final int value;

    MenuOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static MenuOption fromInt(int value) {
        for (MenuOption option : MenuOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManager library = new LibraryManager();
        MenuOption choice;

        System.out.println("Library Management System Started.");
        System.out.println("If books.csv did not exist, it has been created with header.");

        do {
            System.out.println("\n Menu");
            System.out.println("1. Add Book\n2. View Books\n3. Update Book\n4. Delete Book\n5. Search Book\n6. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                sc.next();
            }
            choice = MenuOption.fromInt(sc.nextInt());
            sc.nextLine();

            if (choice == null) {
                System.out.println("Invalid choice!");
                continue;
            }

            switch (choice) {
                case ADD_BOOK: {
                    int id = readInt(sc, "Enter Book ID: ");
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();
                    int year = readInt(sc, "Enter Publication Year: ");
                    library.addBook(new Book(id, name, author, category, year));
                    break;
                }

                case VIEW_BOOKS:
                    library.viewBooks();
                    break;

                case UPDATE_BOOK: {
                    System.out.print("Enter field to update (BookID, BookName, Author, Category, Year): ");
                    String updateField = sc.nextLine();
                    System.out.print("Enter value to search: ");
                    String sValue = sc.nextLine();
                    // System.out.print("Enter field to update (BookID, BookName, Author, Category, Year): ");
                    // String updateField = sc.nextLine();
                    System.out.print("Enter new value: ");
                    String newValue = sc.nextLine();
                    library.updateBook(updateField, sValue, newValue);
                    break;
                }

                case DELETE_BOOK: {
                    System.out.print("Enter field to delete by (BookID, BookName, Author, Category, Year): ");
                    String delField = sc.nextLine();
                    System.out.print("Enter value to delete: ");
                    String delValue = sc.nextLine();
                    library.deleteBook(delField, delValue);
                    break;
                }

                case SEARCH_BOOK: {
                    System.out.print("Enter field to search by (BookID, BookName, Author, Category, Year): ");
                    String searchField = sc.nextLine();
                    System.out.print("Enter value to search: ");
                    String searchValue = sc.nextLine();
                    library.searchBook(searchField, searchValue);
                    break;
                }

                case EXIT:
                    System.out.println("Exiting program...");
                    break;
            }

        } while (choice != MenuOption.EXIT);

        sc.close();
    }

    private static int readInt(Scanner sc, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                value = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Try again.");
            }
        }
        return value;
    }
}
