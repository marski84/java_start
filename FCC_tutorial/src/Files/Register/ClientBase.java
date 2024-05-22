package Files.Register;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

public class ClientBase {

  private List<Client> clientList = new ArrayList<>();

  public void createClientAndAddToBase(
      int id, String firstName, String lastName, String country, double value) {
    if (id <= 0 || firstName == null || lastName == null || country == null || value < 0) {
      throw new InputMismatchException("Not valid parameters!");
    }

    clientList.add(new Client(id, firstName, lastName, country, value));
  }

  public void getHighestValueClient() {
    Collections.sort(clientList, new ClientComparator());
    printClientData(clientList.get(0));
  }

  public void printFullClientData() {
    clientList.forEach(client -> System.out.println(client));
  }

  private void printClientData(Client client) {
    System.out.println(
        "Najbardziej wartościowy klient to "
            + client.getId()
            + ": "
            + client.getFirstName()
            + " "
            + client.getLastName()
            + ", "
            + client.getCountry()
            + ", "
            + client.getValue());
  }

  public List<Client> filterDataByCountry(String filter) {
    List<Client> filteredData =
        clientList.stream()
            .filter(client -> client.getCountry().toLowerCase().equals(filter.toLowerCase()))
            .collect(Collectors.toList());

    System.out.println(filteredData);
    countriesAverageValue(filteredData);

    if (filteredData.size() != 0) {
      return filteredData;
    }
    return null;
  }

  public double countriesAverageValue(List<Client> filteredList) {
    return filteredList.stream()
            .map(Client::getValue)
            .reduce((double) 0, (result, next) -> result + next)
        / filteredList.size();
  }
}
