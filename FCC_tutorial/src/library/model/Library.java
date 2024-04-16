package library.model;

public class Library {
    private static final int MAX_PUBLICATIONS = 2000;

    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    private int publicationsNumber;


    public void addBook(Book book) {
        if(publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = book;
            publicationsNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta");
        }

    }

    public void addMagazine (Magazine magazine) {
        if(publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = magazine;
            publicationsNumber++;
        } else {
            System.out.println("Maksymalna liczba magazynów została osiągnięta");
        }
    }

    public void printMagazines() {
        for(int i=0; i< publicationsNumber; i++) {
            if (publications[i] instanceof Magazine) {
                ((Magazine) publications[i]).toString();
            }
        }
    }

    public void printBooks() {
        for(int i=0; i< publicationsNumber; i++) {
            if (publications[i] instanceof Book) {
                ((Book) publications[i]).toString();
            }
        }
    }
}
