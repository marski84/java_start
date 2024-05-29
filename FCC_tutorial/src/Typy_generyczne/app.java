package Typy_generyczne;

import EncExc1.model.Client;
import Hospital.models.Patient;

public class app {
    public static void main(String[] args){
        Pair<String, Double> first = new Pair<>("okok", 222.22);
        Pair<Long, Integer> second = new Pair<>(1111224111L, 22);
        Pair<Client, Patient> some = new Pair<>(new Client("okok", "okok", true),
                new Patient("fdf","fdsfs", "84032200111")
        );
    System.out.println( some.toString());

    }
}
