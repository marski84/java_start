package library.io;

import library.app.Option;
import library.exceptions.NoSuchOptionException;
import library.model.Book;
import library.model.Magazine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter consolePrinter = new ConsolePrinter();

    public Book readAndCreateBook() {
        consolePrinter.printLine("Title:");
        String bookTitle = getStringData();
        consolePrinter.printLine("Author:");
        String bookAuthor = getStringData();
        consolePrinter.printLine("releaseDate (YYYY):");
        int bookReleaseDate = getIntData();
        consolePrinter.printLine("Amount of pages:");
        int bookPages = getIntData();
        consolePrinter.printLine("Book publisher:");
        String bookPublisher = getStringData();

        if (
                !bookTitle.isEmpty()
                        && !bookAuthor.isEmpty()
                        && bookReleaseDate != 0
                        && bookPages != 0
                        && !bookPublisher.isEmpty()
        ) {
            return new Book(bookTitle, bookPublisher, bookReleaseDate, bookAuthor, bookPages, bookPublisher);
        }
        return null;
    }

    //(String title, String publisher, int releaseDate, int month, int day, String language)
    public Magazine readAndCreateMagazine() {
        consolePrinter.printLine("Title:");
        String magazineTitle = getStringData();
        consolePrinter.printLine("Publisher::");
        String magazinePublisher = getStringData();
        consolePrinter.printLine("releaseDate (YYYY):");
        int magazineReleaseDate = getIntData();
        consolePrinter.printLine("Month:");
        int magazineMonth = getIntData();
        consolePrinter.printLine("Day:");
        int magazineDay = getIntData();
        consolePrinter.printLine("Language:");
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
        return input;
    }

    public int getIntData() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw e;
        } finally {
            scanner.nextLine();
        }
    }


    public void close() {
        scanner.close();
    }
}
