package com.library.service;

import com.library.model.Book;

import java.util.ArrayList;

public class LibraryManager {

    private ArrayList<Book> books;

    public LibraryManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void displayAllBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    public void searchBookById(int id) {

        for (Book book : books) {
            if (book.getId() == id) {
                book.displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void removeBook(int id) {

        for (Book book : books) {

            if (book.getId() == id) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }
}