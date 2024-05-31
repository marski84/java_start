package ComparableAndComparator;

import ComparableAndComparator.exc1.RandomNumberSorting;

import java.util.Arrays;

public class app {

    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino", "Zupa pomidorowa", 3.90);
        products[1] = new Product("Amino", "Zupa ogórkowa", 3.90);
        products[2] = new Product("WINIARY", "Zupa pomidorowa", 4.20);
        products[3] = new Product("WINIARY", "Zupa pieczarkowa", 4.10);
        products[4] = new Product("WINIARY", "Rosół", 3.60);
        products[5] = new Product("Knorr", "Placki ziemniaczane", 6.40);
        products[6] = new Product("Knorr", "Racuchy", 7.20);

        Arrays.sort(products);
        System.out.println(Arrays.toString(products));


        RandomNumberSorting randomNumberSorting = new RandomNumberSorting();
        randomNumberSorting.sortListAscending();
        randomNumberSorting.sortListDescending();


    }


}
