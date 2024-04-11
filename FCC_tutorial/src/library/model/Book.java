package library.model;

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

    public void printInfo() {
        String info = this.getTitle() + "; " + this.getAuthor() + "; " + this.getReleaseDate() + "; "
                + pages + "; " + this.getPublisher();

        if (this.isbn != null) {
            info = info + "; " + isbn;
        }
        System.out.println(info);
    }
}