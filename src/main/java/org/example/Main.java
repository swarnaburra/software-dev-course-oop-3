package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<LibraryItem> library = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println(" Welcome to the Library Manager!");
        System.out.println("---------------------------------");

        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("1. List all items");
            System.out.println("2. Add new book");
            System.out.println("3. Add new album");
            System.out.println("4. Add new movie");
            System.out.println("5. Read books");
            System.out.println("6. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                listAllItems();
            } else if (choice.equals("2")) {
                addNewBook();
            } else if (choice.equals("3")) {
                addNewAlbum();
            } else if (choice.equals("4")) {
                addNewMovie();
            } else if (choice.equals("5")) {
                readBooks();
            } else if (choice.equals("6")) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void listAllItems() {

        if (library.isEmpty()) {
            System.out.println("Library is empty. \n");
            return;
        }

        for (LibraryItem item : library) {
            System.out.println(item);
        }
        System.out.println();
    }

    public static void addNewBook() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();

        System.out.println("Enter author:");
        String author = scanner.nextLine();

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        System.out.println("Enter page count:");
        int pageCount = scanner.nextInt();
        scanner.nextLine();

        library.add(new Book(title, year, author, pageCount));

        System.out.println("Book added successfully! \n");
    }

    public static void addNewAlbum() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();

        System.out.println("Enter author:");
        String author = scanner.nextLine();

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        System.out.println("Enter track count:");
        int trackCount = scanner.nextInt();
        scanner.nextLine();

        library.add(new Album(title, year, author, trackCount));

        System.out.println("Album added successfully! \n");
    }

    public static void addNewMovie() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();

        System.out.println("Enter author:");
        String author = scanner.nextLine();

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        System.out.println("Enter duration in minutes:");
        int durationInMinutes = scanner.nextInt();
        scanner.nextLine();

        library.add(new Movie(title, year, author, durationInMinutes));

        System.out.println("Movie added successfully! \n");
    }

    public static void readBooks() {
        boolean foundBook = false;

        for (LibraryItem item : library) {
            if (item instanceof Book) {
                ((Book) item).readBook();
                foundBook = true;
            }
        }
        if (!foundBook) {
            System.out.println("No books in the library. \n");
        } else {
            System.out.println();
        }
    }
}