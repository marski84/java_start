package EncExc1;

import EncExc1.logic.ClientInfoService;
import EncExc1.model.Client;

public class ClientApp {
    public static void main(String[] args) {
        ClientInfoService clientInfoService = new ClientInfoService();
        Client nullClient = new Client(null, null, true);
        Client onlyFirstNameClient = new Client("Padaka", null, true);
        Client onlyLastNameClient = new Client(null, "Lastname", true);

        System.out.println(clientInfoService.printClientInfo(nullClient));
        System.out.println(clientInfoService.printClientInfo(onlyFirstNameClient));
        System.out.println(clientInfoService.printClientInfo(onlyLastNameClient));


    }
}
