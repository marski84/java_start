package Optional.exc;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;


class ContactApp {
    public static void main(String[] args) {
        Optional<ContactManager> contactManager = ContactReader.readFile("/Users/marcinochmanski/Desktop/java/java_start/java_start/FCC_tutorial/src/Optional/exc/inputFile.txt");
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
//        String email = scanner.nextLine();

//        Optional<Contact> contactByEmail = contactManager.get().findByEmail(email);
//         contactByEmail.ifPresentOrElse(
//                 contact -> contactManager.get().findByEmail(email),
//                 ()-> System.out.println("Brak kontaktu")
//        );
//        System.out.println("Kontakt o wskazanym adresie email:");
//            contactByEmail.ifPresent(Contact::getShortInfo);

        List resultList = contactManager.get().findByLastName("Bar");
        System.out.println(resultList);
    }
}
