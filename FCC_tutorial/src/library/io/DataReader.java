package library.io;

import library.model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);

    public Book readAndCreateBook() {
        System.out.println("Title:");
        String bookTitle = getStringData();
        System.out.println("Author:");
        String bookAuthor = getStringData();
        System.out.println("releaseDate (YYYY):");
        int bookReleaseDate = getIntData();
        System.out.println("Amount of pages:");
        int bookPages = getIntData();
        System.out.println("Book publisher:");
        String bookPublisher = getStringData();


        System.out.println(bookTitle);
        System.out.println(bookPublisher);
        System.out.println(bookPages);

        if (
                !bookTitle.isEmpty()
                && !bookAuthor.isEmpty()
                && bookReleaseDate != 0
                && bookPages != 0
                && !bookPublisher.isEmpty()
        ) {
            return new Book(bookTitle, bookAuthor, bookReleaseDate, bookPages, bookPublisher);
        }
        return null;
    }

    private String getStringData() {
        while (!scanner.hasNextLine()) {
            System.out.println("Please provide a valid string input!");
            scanner.next();
        }
        String input = scanner.nextLine();
        System.out.println(input);
        return input;
    }

    public int getIntData() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please provide a valid integer input!");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println(input);
        return input;
    }


    public void close() {
        scanner.close();
    }
}
