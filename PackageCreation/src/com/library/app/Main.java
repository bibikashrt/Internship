package com.library.app;

import com.library.model.Book;
import com.library.service.LibraryManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LibraryManager manager = new LibraryManager();

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    Book book = new Book(id, title, author);

                    manager.addBook(book);
                    break;

                case 2:
                    manager.displayAllBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    int searchId = scanner.nextInt();

                    manager.searchBookById(searchId);
                    break;

                case 4:

                    System.out.print("Enter Book ID: ");
                    int removeId = scanner.nextInt();

                    manager.removeBook(removeId);
                    break;

                case 5:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}