package enumExc1;

import java.util.Scanner;

public class PizzaList {
    private Scanner scanner = new Scanner(System.in);


    public void getUserSelection() {
        getPizzaList();
        System.out.println("What is your selection?");
        this.userOrder();
    }

    private void getPizzaList() {
        Pizza[] pizzas = Pizza.values();
        System.out.println("Wybierz pizze");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.ordinal() + 1);
            System.out.println(pizza);
            System.out.println(pizza.getDescription());
        }
    }

    private Pizza userOrder() {
        String input = scanner.nextLine();
        Pizza[] pizzas = Pizza.values();
        System.out.println(input);
        Pizza selection = null; 
        for (Pizza pizza: pizzas) {
            if (pizza.name().toLowerCase().equals(input.toLowerCase())) {
                selection = pizza;
                break;
            }

        }
        System.out.println("wybór: " + selection);

        if (selection == null) {
            System.out.println("Wybierz pizze");
            userOrder();
        }

    return Pizza.CAPRICIOSA;
    }
}
