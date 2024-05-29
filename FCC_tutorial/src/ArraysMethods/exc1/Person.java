package ArraysMethods.exc1;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable, Comparable<Person> {
    private static final long serialVersionUID = 381201177088226528L;

    private String firstName;
    private String lastName;
    private String pesel;

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return pesel == person.pesel && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Pesel=" + pesel +
                '}';
    }

    public int getSerial() {
        return (int) serialVersionUID;
    }


    @Override
    public int compareTo(Person o) {
        if (o == null) {
            return -1;
        }
        return (int) serialVersionUID;
    }
}
