package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDataContainer {
    List<SomePerson> people = new ArrayList<SomePerson>();

    public void add(SomePerson person) {
        if (person == null) {
            throw new NullPointerException("person is null");
        }
//        if (findById(person.getId()).isPresent()) {
//            throw new IllegalArgumentException("person already exist");
//        }

        findById(person.getId()).ifPresent(
                (record) -> {
                    throw new IllegalArgumentException("person already exist");
                }
        );
            people.add(person);
    }

    public Optional<SomePerson> findById(int id) {
        for (SomePerson p : people) {
            if (p.getId() == id) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public void printPersonLastName(SomePerson person) {
        System.out.println(person.getLastName());
    }

    public String findLastNameById(int id) {
        return findById(id).map(SomePerson::getLastName).orElse("anonym");


//        return people.stream()
//                .filter(person -> person.getId() == id)
//                .findFirst()
//                .map(person -> person.getLastName())
//                .toString();
    }
}
