package library.app;

import library.io.DataReader;
import library.model.Book;
import library.model.Magazine;

class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.3";
        DataReader dataReader = new DataReader();

        Book[] books = new Book[1000];
        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, "296", 298,
                "9788373271890");
        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", " Josh ua Bloch", 2009,
                "352", 4444, "9788324620845");
        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, "McGraw-Hill Osborne Media",
                9000);

        Magazine[] magazines = new Magazine[2000];
        magazines[1] = new Magazine("fdsfsd", "dsfsdfsdf", 2000, 1, 1, "sdsd");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
//        books[0].printInfo();
//        books[1].printInfo();
//        books[2].printInfo();

        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}