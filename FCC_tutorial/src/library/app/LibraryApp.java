package library.app;

import library.io.DataReader;
import library.model.Book;
import library.model.Magazine;

class LibraryApp {
    public static void main(String[] args) {
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}