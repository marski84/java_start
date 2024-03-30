package EncExc1.logic;

import EncExc1.model.Client;

public class ClientInfoService {

    public String  printClientInfo(Client client) {
        if (client != null) {
            String clientFirstName = client.getFirstName();
            String clientLastName = client.getLastName();
            if (clientFirstName == null && clientLastName == null) {
                return this.getInfoIfAllDataIsNull();
            } else if (clientFirstName == null) {
                return this.getInfoIfFirstNameIsNull(clientLastName);
            } else if (clientLastName == null) {
                return this.getInfoIfLastNameIsNull(clientFirstName);
            }
        }

        return null;
    }

    private String getInfoIfAllDataIsNull() {
        return "Witaj nieznajomy";
    }

    private String getInfoIfFirstNameIsNull(String lastName) {
        return "Dzień dobry panie/pani " + lastName;
    }

    private String getInfoIfLastNameIsNull(String firstName) {
        return "Witaj " + firstName;
    }
}
