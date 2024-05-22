package Files.Register;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String country;
    private double value;

    public Client(int id, String firstName, String lastName, String country, double value) {
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.value = value;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public double getValue() {
        return value;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", country=" + country +
                ", value=" + value +
                '}';
    }
}
