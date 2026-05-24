
import java.io.*;
import java.util.*;

public class LibraryManager {

    private final BookRepository repository;

    public LibraryManager() {
        this.repository = new CsvBookRepository("books.csv");
    }

    private interface BookRepository {

        void addBook(Book book);

        List<Book> getAllBooks();

        List<Book> searchBooks(String fieldName, String value);

        void updateBook(String updateField, String searchvalue, String newValue);

        void deleteBook(String fieldName, String value);
    }

    private static class CsvBookRepository implements BookRepository {

        private final String FILE_NAME;
        private final List<String> headers = Arrays.asList("BookID", "BookName", "Author", "Category", "Year");

        public CsvBookRepository(String fileName) {
            this.FILE_NAME = fileName;
            ensureHeaderExists();
        }

        private void ensureHeaderExists() {
            File file = new File(FILE_NAME);
            try {
                if (!file.exists() || file.length() == 0) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
                        bw.write(String.join(",", headers));
                        bw.newLine();
                        bw.flush();
                        System.out.println("books.csv created with header.");
                    }
                }
            } catch (IOException e) {
                System.out.println("Error creating file with header: " + e.getMessage());
            }
        }

        @Override
        public void addBook(Book book) {
            ensureHeaderExists();
            try {
                if (getAllBooks().stream().anyMatch(b -> b.getBookId() == book.getBookId())) {
                    System.out.println("ID already exists. Cannot add duplicate.");
                    return;
                }
                List<Book> books = getAllBooks();
                books.add(book);
                saveAll(books);
                // sorted by ID inside saveAll
                // try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
                //     bw.write(book.toCSV());
                //     bw.newLine();
                // }
                System.out.println("Book added successfully.");
            } catch (Exception e) {
                System.out.println("Error adding book: " + e.getMessage());
            }
        }

        @Override
        public List<Book> getAllBooks() {
            List<Book> books = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
                br.readLine();
                String line;
                while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
                    books.add(Book.fromCSV(line));
                }
            } catch (Exception e) {
            }
            return books;
        }

        @Override
        public List<Book> searchBooks(String fieldName, String value) {
            List<Book> results = new ArrayList<>();
            for (Book b : getAllBooks()) {
                if (b.matchesField(fieldName, value)) {
                    results.add(b);
                }
            }
            return results;
        }

        @Override
        public void updateBook(String updateField, String searchvalue, String newValue) {
            List<Book> books = getAllBooks();
            boolean found = false;
            for (Book b : books) {
                if (b.matchesField(updateField, searchvalue)) {
                    switch (updateField) {
                        case "BookID":
                            b.setBookId(Integer.parseInt(newValue));
                            break;
                        case "BookName":
                            b.setBookName(newValue);
                            break;
                        case "Author":
                            b.setAuthorName(newValue);
                            break;
                        case "Category":
                            b.setCategory(newValue);
                            break;
                        case "Year":
                            b.setPublicationYear(Integer.parseInt(newValue));
                            break;
                        default:
                            System.out.println("Invalid field to update: " + updateField);
                            return;
                    }
                    found = true;
                    break;
                }
            }
            saveAll(books);
            System.out.println(found ? "Update successful." : "No matching book found to update.");
        }

        @Override
        public void deleteBook(String fieldName, String value) {
            List<Book> books = getAllBooks();
            boolean found = books.removeIf(b -> b.matchesField(fieldName, value));
            saveAll(books);
            System.out.println(found ? "Book(s) deleted successfully." : "No matching book found to delete.");
        }

        private void saveAll(List<Book> books) {
            books.sort(Comparator.comparingInt(Book::getBookId));
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
                bw.write(String.join(",", headers));
                bw.newLine();
                for (Book b : books) {
                    bw.write(b.toCSV());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
    }

    public void addBook(Book book) {
        repository.addBook(book);
    }

    public void viewBooks() {
        System.out.println("\nBook List");
        for (Book book : repository.getAllBooks()) {
            System.out.println(book);
        }
    }

    public void searchBook(String fieldName, String value) {
        List<Book> results = repository.searchBooks(fieldName, value);
        if (results.isEmpty()) {
            System.out.println("No book found with " + fieldName + " = " + value);
        } else {
            results.forEach(System.out::println);
        }
    }

    public void updateBook(String updateField, String searchvalue, String newValue) {
        repository.updateBook(updateField, searchvalue, newValue);
    }

    public void deleteBook(String fieldName, String value) {
        repository.deleteBook(fieldName, value);
    }
}
