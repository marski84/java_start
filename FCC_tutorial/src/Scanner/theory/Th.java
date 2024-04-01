package Scanner.theory;

import java.util.Locale;
import java.util.Scanner;

public class Th {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Wprowadź swoje imię: ");
        String firstName = input.nextLine();
        System.out.println("Wprowadź swoje nazwisko: ");
        String lastName = input.nextLine();
        System.out.println("Podaj swój wiek: ");
        int age = input.nextInt();

        // input.close(); // zamykanie Scannera bazującego na System.in jest opcjonalne

        System.out.println("Cześć " + firstName + " " + lastName);
        System.out.println("Masz już " + age + ", starość nie radość! :)");
    }



    }

