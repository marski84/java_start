package library.model;

import java.util.Objects;

public class Book extends Publication {
    private String author;
    private int pages;
    private String isbn;


    public Book(String title, String publisher, int releaseDate, String author, int pages, String isbn) {
        this(title, publisher, releaseDate, author, pages);
        this.isbn = isbn;
    }


    public Book(String title, String publisher, int releaseDate, String author, int pages) {
        super(title, publisher, releaseDate);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return pages == book.pages && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, pages, isbn);
    }
}