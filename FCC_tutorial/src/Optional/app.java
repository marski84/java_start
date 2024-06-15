package Optional;

import java.util.Optional;

public class app {
    public static void main(String[] args) {
        PersonDataContainer personDataContainer = new PersonDataContainer();
        personDataContainer.add(new SomePerson(1, "Jan", "Kowalski"));
        personDataContainer.add(new SomePerson(2, "Karol", "Zawadzki"));
        personDataContainer.add(new SomePerson(3, "Bartosz", "Abacki"));
        personDataContainer.add(new SomePerson(4, "Ania", "Walczak"));


        Optional<SomePerson> person1 = personDataContainer.findById(2);
//        System.out.println(person1);
        person1.ifPresent(person -> System.out.println(person.getLastName()));

        Optional<SomePerson> person2 = personDataContainer.findById(5);
        person2.ifPresentOrElse(
                personDataContainer::printPersonLastName,
                () -> System.out.println("dupa")
        );

        System.out.println(personDataContainer.findLastNameById(5));


    }
}
