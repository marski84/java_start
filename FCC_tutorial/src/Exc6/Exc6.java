package Exc6;

public class Exc6 {
    public static void main(String[] args) {
        Auction auction1 = new Auction();
        auction1.title = "Xbox one";
        auction1.description = "Konsola dla wymagających graczy";
        auction1.price = 999.99;

        Seller seller = new Seller();
        seller.firstName = "Jan";
        seller.lastName = "Palony";
        auction1.seller = seller;

        seller.adress = new AdressInfo();
        seller.adress.city = "Wrocław";
        seller.adress.postalCode = "50-500";
        seller.adress.homeNo = "24A";
        seller.adress.flatNo = 21;


        Auction auction2 = new Auction();
        auction2.title = "Samsung s20";
        auction2.description = "telefon";
        auction2.price = 3999;

        Seller seller2= new Seller();
        seller2.firstName = "Joanna";
        seller2.lastName = "Oszukana";
        seller2.adress = new AdressInfo();
        auction2.seller = seller2;

        System.out.println("Dostępne aukcje");
        System.out.println(auction1.title + ", " + auction1.description + ", " + auction1.price + "zł, sprzedający: " +
                auction1.seller.firstName + " " + auction1.seller.lastName);
        System.out.println(auction2.title + ", " + auction2.description + ", " + auction2.price + "zł, sprzedający: " +
                auction2.seller.firstName + " " + auction2.seller.lastName);



    }
}
