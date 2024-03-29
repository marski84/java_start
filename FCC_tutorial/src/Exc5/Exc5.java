package Exc5;

public class Exc5 {
    public static void main(String[] args) {
        BankAccount first = new BankAccount();
        first.owner = new Person();
        first.owner.firstName = "Jan";
        first.owner.lastName = "Kowalski";
        first.owner.residenceAdress = new Adress();
        first.owner.residenceAdress.city = "Some city";
        first.owner.residenceAdress.street = "Some street";
        first.owner.residenceAdress.aptNumber = "11D";

        first.cashAmount = 10000.00;


        BankAccount second = new BankAccount();
        second.owner = new Person();
        second.owner.firstName = "Marta";
        second.owner.lastName = "Kowalska";
        second.owner.residenceAdress = new Adress();
        second.owner.residenceAdress.city = "shitty";
        second.owner.residenceAdress.street = "shitty street";
        second.owner.residenceAdress.aptNumber = "999zy";

        second.cashAmount = 5000.00;

        System.out.println(first.owner.firstName + " " + first.owner.lastName);
        System.out.println("mieszka w miejscowości: " + first.owner.residenceAdress.city);
        System.out.println("na koncie posiada środki: " + first.cashAmount);

        System.out.println(second.owner.firstName + " " + second.owner.lastName);
        System.out.println("mieszka w miejscowości: " + second.owner.residenceAdress.city);
        System.out.println("na koncie posiada środki: " + second.cashAmount);





    }
}
