package Files.Register;

import java.util.Comparator;

public class ClientComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return (int) (o2.getValue() - o1.getValue());
    }
}
