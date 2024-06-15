package Optional.exc;

import java.util.*;

public class ContactManager {
    private Set<Contact> contacts = new HashSet<>();

    void addContact(Contact contact) {
        contacts.add(contact);
    }

    Optional<Contact> findByEmail(String email) {
        Objects.requireNonNull(email, "email cannot be null");
        return contacts.stream()
                .filter(contact -> email.equals(contact.getEmail()))
                .findFirst();
    }

    List<Contact> findByLastName(String textFragment) {
        Objects.requireNonNull(textFragment, "search text cannot be null");

        return contacts.stream()
                .peek(contact -> System.out.println(contact.getLastName() + " " + textFragment))
                .peek(contact -> System.out.println(contact.getLastName().contains(textFragment)))
                .filter(contact -> contact.getLastName().contains(textFragment))
                .toList();
    }
}