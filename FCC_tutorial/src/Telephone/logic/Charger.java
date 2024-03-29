package Telephone.logic;

import Telephone.data.Telephone;

public class Charger {
    public Charger() {}

    public void charge(Telephone telephone) {
        System.out.println(telephone.getChargeLevel());
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
        System.out.println(telephone.getChargeLevel());
    }
}
