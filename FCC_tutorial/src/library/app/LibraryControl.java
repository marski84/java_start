package library.app;

import library.exceptions.NoSuchOptionException;
import library.io.ConsolePrinter;
import library.io.DataReader;
import library.model.Book;
import library.model.Library;
import library.model.Magazine;

import java.util.InputMismatchException;

import static library.app.Option.ADD_BOOK;

public class LibraryControl {


    private DataReader dataReader = new DataReader();

    private Library library = new Library();
    private ConsolePrinter consolePrinter = new ConsolePrinter();

    public void controlLoop() {
        Option option = null;
        do {
            while (option == null) {
                try{
                    int input = 0;
                    printOptions();
                    while (input == 0) {
                        try {
                            input = dataReader.getIntData();
                        } catch (InputMismatchException e) {
                            System.out.println("podaj liczbę!");
                        }
                    }
                    option = Option.createFromInt(input);
                } catch (NoSuchOptionException e) {
                    System.out.println(e);
                }
            }

            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case EXIT:
                    exit();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while(option != Option.EXIT);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Option option : Option.values()) {
            consolePrinter.printLine(option.toString());
        }
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void exit() {
        System.out.println("Koniec programu, papa!");
        // zamykamy strumień wejścia
        dataReader.close();
    }



}
