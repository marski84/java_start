package library.io;

import library.model.Book;
import library.model.Magazine;

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
            return new Book(bookTitle, bookPublisher, bookReleaseDate, bookAuthor,  bookPages, bookPublisher);
        }
        return null;
    }

//(String title, String publisher, int releaseDate, int month, int day, String language)
    public Magazine readAndCreateMagazine() {
        System.out.println("Title:");
        String magazineTitle = getStringData();
        System.out.println("Publisher::");
        String magazinePublisher = getStringData();
        System.out.println("releaseDate (YYYY):");
        int magazineReleaseDate = getIntData();
        System.out.println("Month:");
        int magazineMonth = getIntData();
        System.out.println("Day:");
        int magazineDay = getIntData();
        System.out.println("Language:");
        String magazineLanguage = getStringData();

        if (
                        !magazineTitle.isEmpty()
                        && !magazinePublisher.isEmpty()
                        && magazineReleaseDate != 0
                        && magazineMonth != 0
                        && magazineDay != 0
                        && !magazineLanguage.isEmpty()
        ) {
            return new Magazine(magazineTitle, magazinePublisher, magazineReleaseDate, magazineMonth, magazineDay, magazineLanguage);
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
