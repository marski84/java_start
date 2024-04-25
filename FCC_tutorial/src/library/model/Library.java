package library.model;

public class Library {
    private static final int MAX_PUBLICATIONS = 2000;

    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    private int publicationsNumber;


    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication publication) {
        if (publicationsNumber >= MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded " + MAX_PUBLICATIONS    );
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    public void printMagazines() {
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Magazine) {
                publications[i].toString();
            }
        }
    }

    public void printBooks() {
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Book) {
                publications[i].toString();
            }
        }
    }
}
